numero_productos = int(input())

total_productos = 0
total_iva = 0

productos = {1: "Lapiz", 2: "Cuaderno", 3: "Borrador", 4: "Regla",
             5: "ColoresX12", 6: "Escuadra", 7: "Calculadora", 8: "CrayonesX6"}


precios = {1: 2500, 2: 4500, 3: 1500, 4: 5000,
           5: 24000, 6: 4700, 7: 45000, 8: 8900}

codigo_lista = []
valor_con_iva_l = {}
valor_sin_iva_l = {}


for i in range(numero_productos):

    codigo_producto = int(input())
    codigo_lista.append(codigo_producto)

    cantidad = int(input())

    tipo_de_iva = int(input())

    if tipo_de_iva == 1:

        valor = precios[codigo_producto]*cantidad
        valor_sin_iva_l[codigo_producto] = float(valor)

        valor_con_iva_l[codigo_producto] = float(valor)

        total_productos = total_productos + valor

    if tipo_de_iva == 2:

        valor = precios[codigo_producto]*cantidad
        valor_sin_iva_l[codigo_producto] = float(valor)

        valor_con_iva = valor*0.05+valor
        valor_con_iva_l[codigo_producto] = float(valor_con_iva)

        total_productos = total_productos + valor_con_iva
        total_iva = total_iva + (valor * 0.05)

    if tipo_de_iva == 3:
        valor = precios[codigo_producto]*cantidad
        valor_sin_iva_l[codigo_producto] = float(valor)

        valor_con_iva = valor*0.19+valor
        valor_con_iva_l[codigo_producto] = float(valor_con_iva)

        total_productos = total_productos + valor_con_iva
        total_iva = total_iva + (valor * 0.19)


def ordenar_nombre(lista):
    for i in range(len(lista)-1):
        for j in range(i+1, len(lista)):
            if lista[i] > lista[j]:
                temp = lista[j]
                lista[j] = lista[i]
                lista[i] = temp


ordenar_nombre(codigo_lista)


for key in codigo_lista:
    print(key)
    print(productos[key])

    print(valor_sin_iva_l[key])
    print(valor_con_iva_l[key])

print(total_productos)
print(total_iva)

