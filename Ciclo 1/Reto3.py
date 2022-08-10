numero_productos = int(input())
total_productos = 0
total_iva = 0

codigo = []
nombres = []
cantidadL = []
valor_sin_ivaL = []
tipo_de_ivaL = []

lista_valor_siniva = []
lista_valor_coniva = []

for i in range(numero_productos):

    codigo_producto = int(input())
    codigo.append(codigo_producto)

    nombre_producto = str(input())
    nombres.append(nombre_producto)

    cantidad = int(input())
    cantidadL.append(cantidad)

    valor_sin_iva = float(input())
    valor_sin_ivaL.append(valor_sin_iva)

    tipo_de_iva = int(input())
    tipo_de_ivaL.append(tipo_de_iva)

    if tipo_de_iva == 1:
        valor = valor_sin_iva * cantidad
        
        lista_valor_siniva.append(valor)
        lista_valor_coniva.append(valor)

        valor_total = valor_sin_iva * cantidad
        total_productos = total_productos + valor_total
    else:
        if tipo_de_iva == 2:
            valor = valor_sin_iva * cantidad
            lista_valor_siniva.append(valor)

            valor_total = valor * 0.05 + valor
            lista_valor_coniva.append(valor_total)

            total_productos = total_productos + valor_total
            total_iva = total_iva + (valor * 0.05)
        else:
            valor = valor_sin_iva * cantidad
            lista_valor_siniva.append(valor)

            valor_total = valor * 0.19 + valor
            lista_valor_coniva.append(valor_total)

            total_productos = total_productos + valor_total
            total_iva = total_iva + (valor * 0.19)


print(len(codigo))
print(len(nombres))
print(len(cantidadL))
print(len(valor_sin_ivaL))
print(len(tipo_de_ivaL))

for k in range(len(codigo)):
    print(codigo[k])
    print(nombres[k])
    print(lista_valor_siniva[k])
    print(lista_valor_coniva[k])

print(total_productos)
print(total_iva)