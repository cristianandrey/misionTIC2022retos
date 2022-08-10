numero_productos = int(input())

total_productos = 0
total_iva = 0

productos = []


for i in range(numero_productos):

    producto = []

    codigo_producto = int(input())
    producto.append(codigo_producto)

    nombre_producto = input()
    producto.append(nombre_producto)

    cantidad = int(input())
    producto.append(cantidad)

    valor_sin_iva = float(input())
    producto.append(valor_sin_iva)

    tipo_de_iva = int(input())
    producto.append(tipo_de_iva)

    if tipo_de_iva == 1:
        valor = valor_sin_iva*cantidad

        valor_con_iva=valor
        
        producto.append(valor)
        producto.append(valor_con_iva)

        total_productos = total_productos + valor

    if tipo_de_iva == 2:
        valor = valor_sin_iva*cantidad
        valor_con_iva = valor*0.05+valor

        producto.append(valor)
        producto.append(valor_con_iva)

        total_productos = total_productos + valor_con_iva
        total_iva = total_iva + (valor * 0.05)

    if tipo_de_iva == 3:
        valor = valor_sin_iva*cantidad
        valor_con_iva = valor*0.19+valor

        producto.append(valor)
        producto.append(valor_con_iva)

        total_productos = total_productos + valor_con_iva
        total_iva = total_iva + (valor * 0.19)

    productos.append(producto)


def ordenar_nombre(lista):
    for i in range(len(lista)-1):
        for j in range(i+1, len(lista)):
            if lista[i][1] > lista[j][1]:
                temp = lista[j]
                lista[j] = lista[i]
                lista[i] = temp


ordenar_nombre(productos)

for key in productos:
    print(key[0])
    print(key[1])

    print(key[5])
    print(key[6])

print(total_productos)
print(total_iva)
