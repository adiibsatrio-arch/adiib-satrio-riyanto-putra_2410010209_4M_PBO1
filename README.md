# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi sederhana **Sistem Rental Motor** menggunakan bahasa pemrograman Java sebagai tugas akhir mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini digunakan untuk melakukan proses penyewaan motor. Pengguna dapat memasukkan nama penyewa, memilih motor yang tersedia, memasukkan lama penyewaan, kemudian program akan menghitung total biaya sewa dan menampilkan struk penyewaan.

Aplikasi ini mengimplementasikan konsep-konsep penting dalam Pemrograman Berbasis Objek (Object Oriented Programming/OOP) seperti **Class, Object, Attribute, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, Input Output Sederhana, Array, dan Error Handling**.

---

# Penjelasan Kode

Berikut adalah bagian kode yang menerapkan konsep-konsep OOP.

### 1. Class

Class merupakan blueprint atau cetakan untuk membuat object.

Pada program ini terdapat class:

- Kendaraan
- Motor
- Pelanggan
- Rental
- Main

```java
public class Kendaraan {
}

public class Motor extends Kendaraan {
}

public class Pelanggan {
}

public class Rental {
}

public class Main {
}
```

---

### 2. Object

Object adalah hasil dari pembuatan class.

Contoh:

```java
Rental rental = new Rental();

Pelanggan pelanggan = new Pelanggan(nama);

Motor[] motor = {
    new Motor("Vario 160",150000,"Honda"),
    new Motor("NMAX",200000,"Yamaha"),
    new Motor("CBR150R",250000,"Honda")
};
```

---

### 3. Attribute

Attribute merupakan variabel yang dimiliki oleh suatu class.

Contoh:

```java
private String nama;
private int harga;
private String merk;
```

---

### 4. Constructor

Constructor digunakan saat object dibuat.

```java
public Kendaraan(String nama, int harga){
    this.nama = nama;
    this.harga = harga;
}

public Motor(String nama, int harga, String merk){
    super(nama, harga);
    this.merk = merk;
}
```

---

### 5. Mutator (Setter)

Digunakan untuk mengubah nilai attribute.

```java
public void setNama(String nama){
    this.nama = nama;
}

public void setHarga(int harga){
    this.harga = harga;
}
```

---

### 6. Accessor (Getter)

Digunakan untuk mengambil nilai attribute.

```java
public String getNama(){
    return nama;
}

public int getHarga(){
    return harga;
}
```

---

### 7. Encapsulation

Encapsulation diterapkan dengan membuat attribute menjadi **private**.

```java
private String nama;
private int harga;
private String merk;
```

---

### 8. Inheritance

Motor merupakan turunan dari Kendaraan.

```java
public class Motor extends Kendaraan{
}
```

---

### 9. Polymorphism

Program menggunakan **Method Overriding**.

```java
@Override
public void tampilkan(){
    System.out.println("Motor : " + getNama());
    System.out.println("Merk : " + merk);
    System.out.println("Harga : Rp" + getHarga());
}
```

---

### 10. Seleksi

Program menggunakan seleksi **if**.

```java
if(pilih >= 1 && pilih <= motor.length){

}else{

}
```

---

### 11. Perulangan

Program menggunakan **for**.

```java
for(int i = 0; i < motor.length; i++){
    motor[i].tampilkan();
}
```

---

### 12. Input Output Sederhana

Menggunakan Scanner.

```java
Scanner input = new Scanner(System.in);

System.out.print("Nama Penyewa : ");
String nama = input.nextLine();
```

---

### 13. Array

Program menggunakan array object.

```java
Motor[] motor = {
    new Motor("Vario 160",150000,"Honda"),
    new Motor("NMAX",200000,"Yamaha"),
    new Motor("CBR150R",250000,"Honda")
};
```

---

### 14. Error Handling

Program menggunakan **try-catch**.

```java
try{

    int pilih = input.nextInt();

}catch(Exception e){

    System.out.println("Input harus berupa angka!");

}
```

---

# Usulan Nilai

| No | Materi | Nilai |
| :-: | ---------------- | :---: |
| 1 | Class | 5 |
| 2 | Object | 5 |
| 3 | Attribute | 5 |
| 4 | Constructor | 5 |
| 5 | Mutator | 5 |
| 6 | Accessor | 5 |
| 7 | Encapsulation | 5 |
| 8 | Inheritance | 5 |
| 9 | Polymorphism | 10 |
| 10 | Seleksi | 5 |
| 11 | Perulangan | 5 |
| 12 | IO Sederhana | 10 |
| 13 | Array | 15 |
| 14 | Error Handling | 15 |
| | **TOTAL** | **100** |

---

# Pembuat

**Nama :** Adiib Satrio

**NPM :** 2410010209

**Kelas :** 4M
