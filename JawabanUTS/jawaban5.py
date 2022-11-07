#Membuat Program Memilih Menu dengan Rumus PPN 10%

from email.errors import HeaderMissingRequiredValue


def jualan():
    x = "capucino"
    y = "teh"
    print ("Pilihan")
    print ("1.", x)
    print ("2.", y)
    print ("3. Exit")

def capucino():
    cino = "memilih capucino"
    print(cino)
    capucino = int(input("masukkan harga : "))
    ppn = 10/100
    pajak = capucino*ppn
    total = capucino+pajak
    print("Jumlah yang harus dibayarkan ",total)

def teh():
    teh = "memilih teh"
    print(teh)
    teh = int(input("masukkan harga : "))
    ppn = 10/100
    pajak = teh*ppn
    total = teh+pajak
    print("Jumlah yang harus dibayarkan ",total)

def welcome():
    nim = 20210801197
    nama = "ANANDA DWI RIZKYTA"
    print ("NIM : ", nim)
    print ("NAMA : ", nama)

while True:
    welcome()
    jualan()
    pil = int(input("masukkan pilihan : "))
    if pil == 1:
        capucino()
    elif pil == 2:
        teh()
    elif pil == 3:
        break
    else:
        print ("pilihan salah")