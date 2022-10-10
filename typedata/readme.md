# Rangkuman Type data
Di sesi perkuliahan bahasa pemrograman ini, saya dapat mengetahui mengenai beberapa type data, yaitu:

# String
String disebut sebagai kumpulan karakter yang dikelilingi oleh tanda kutip tunggal, tanda kutip ganda bahkan tanda kutip tiga.

from re import I


a = "hello"
print (a)
print (type(a))

# integer
Integer merupakan tipe data numerik yang mewakili seluruh bilangan bulat. Tipe data ini tidak memiliki angka desimal.

b = 12
print (b)
print (type(b))

# float
Float adalah data type numerik yang digunakan untuk menyimpan angka yang mungkin memiliki komponen pecahan seperti nilai moneter (707.07, 0.7, 707.00).

c = 10.5
print (c)
print (type(c))

# tuple
Tuple adalah data untaian yang menyimpan berbagai tipe data tapi isinya tidak bisa diubah.

d = 20,5
print (d)
print (type(d))

# data complex
Data complex untuk menyatakan pasangan angka real dan imajiner.

e = 1j
print (e)
print (type(e))

z = complex ('5-9j')
print (z)

# type data list
Type data list adalah data untaian yang menyimpan berbagai tipe data dan isinya bisa diubah-ubah.

f = ["a","b","c"]
print (f)
print (type(f))

#contoh 
list_f = [1,2,3]
print (list_f[0])
#contoh tuple
tuple_f = 1,2,3
print (tuple_f[0])

#contoh set
set_f = {1,2,3}
print (set_f)

# type data set
Tipe data set merupakan tipe data yang digunakan untuk menyimpan banyak nilai dalam satu variabel dan yang tidak beraturan serta memiliki nilai yang unik (tidak ada duplikasi).

g = {"a","b","c"}
print (g)
print (type(g))

# type data frozenset
Type data frozenset berfungsi untuk mengubah iterable menjadi objek set yang tidak bisa diubah (immutable). Frozenset adalah versi immutable dari set.

h = frozenset({1,2,3})
print (type(h))

# type data boolean
Menyatakan benar True yang bernilai 1, atau salah False yang bernilai 0.

i = True
j = False
print (i,j)
print (type(i))
print (type(j))