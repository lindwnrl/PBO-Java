<h1 align = "center">Jobsheet 6 - PBO </h1>

```
Nama        :Lindhu Nuril Rahmatdanto
NIM         :254107020216
Kelas       :TI 2G  
```

## Pertanyaan Percobaan 1
1. Mengapa kompilasi pada Langkah 5 gagal? Tuliskan pesan error pertama beserta file dan baris tempat error muncul.
Karena belum di extends sehingga class b tidak memiliki nilai dan variable dari x dan y

2. Baris kode mana yang diubah pada Langkah 6, dan apa artinya? Sebutkan class yang berperan sebagai superclass dan subclass.
baris kode yang diubah pada class tersebut adalah pada baris deklarasi class.Artinya adalah class B memanjangkan lingkupnya kepada class A sehingga class B menjadi subclass / anak class dari class A yang menjadi super class / parent
3. Setelah diperbaiki, sebutkan atribut dan method yang dapat dipakai oleh objek hitung. Kelompokkan mana yang dideklarasikan di ClassA dan mana yang dideklarasikan di ClassB.
Semua method dan atribut yang ada pada pada baik class A maupun class B bisa di akses karena access modifiernya adalah public dan sudah di extends
4. Pada MainPercobaan1, hitung.x = 20 ditulis pada objek ClassB, padahal atribut x tidak dideklarasikan di ClassB. Mengapa hal ini diperbolehkan?
karena class B sudah merupakan subclass dari class A yang mengakibatkan class B bisa mengakses atribut dari class A (selama access modifiernya tepat)
5. Atribut x dan y pada ClassA dibuat public, sehingga dapat diubah langsung dari MainPercobaan1. Apa risiko dari desain seperti ini? (jawaban ini akan kita telusuri pada Percobaan 2)
Risiko dari desain system seperti ini adalah atribut yang ada pada class tertentu bisa diakses dari hampir mana saja karena access modifiernya adalah public
6. Coba tambahkan class ClassD lalu ubah deklarasi menjadi public class ClassB extends ClassA, ClassD. Apa yang terjadi? Apa yang dapat Anda simpulkan tentang jumlah superclass langsung pada Java?
Tidak bisa, karena java tidak mengizinkan adanya 2 extend pada waktu yang sama

## Pertanyaan Percobaan 2
1. Di file dan baris mana error pada Langkah 5 muncul, dan apa pesannya? Mengapa error tidak muncul di MainPercobaan2?
Error terdapat di file classB karena mencoba mengakses atribut private di classA.Error tidak muncul di MainPercobaan2 karena memang singkatnya error di deteksi lebih awal di classB yang mencoba mengakses atribut di classA
2. Jelaskan penyebab error tersebut dengan merujuk pada tabel kontrol pengaksesan (Langkah 1).
Karena access modifier private tidak bisa diakses selain di dalam class nya (Walaupun di extends sekalipun)
3. Pada kode awal, MainPercobaan2 memanggil hitung.setX(20) dan tidak error, padahal x bersifat private. Mengapa pemanggilan ini diperbolehkan, dan di mana nilai x tersimpan?
Karena method setX adalah public dan int x yang digunakan merupakan constructor ber parameter sehingga nilainya butuh di set dan diambil apabila mau di display
4. Bandingkan Perbaikan A (protected) dan Perbaikan B (private + getter) dari sisi encapsulation. Mana yang Anda pilih untuk program sungguhan? Jelaskan alasannya.
Keduanya memiliki plus minus nya masing-masing.Dengan getter setter kita tidak butuh inisialisasi nilai pada masing-masing atribut.Sedangkan pada protected tidak memerlukan getter setter dan hanya cukup inisialisasi
5. Andaikan ClassA dan ClassB berada di package yang berbeda. Berdasarkan tabel, apakah ClassB tetap dapat mengakses atribut protected milik ClassA? Bagaimana jika atributnya default (tanpa modifier)?
Tidak bisa karena berada dalam satu package yang sama sehingga tidak memungkinkan adanya access

## Pertanyaan Percobaan 3
1. Jelaskan fungsi super pada super.phi = phi; dan super.r = r; di method setSuperPhi() dan setSuperR() milik Tabung.
Karena di tabung tidak ada method untuk menghitung bangun di bawahnya maka dibutuhkan pengambilan method dan atribut pada class Bangun
2. Jelaskan fungsi super dan this pada ekspresi super.phi * super.r * super.r * this.t di method volume().
Ekspresi super pada class tabung mengacu pada pengambilan atribut pada parent class nya (yang pada kasus ini adalah class Bangun) sedangkan this mengacu pada variable yg ada pada parameter dan class itu sendiri
3. Mengapa Tabung tidak mendeklarasikan atribut phi dan r, tetapi tetap dapat mengaksesnya? Apa yang terjadi bila pada Bangun keduanya diubah menjadi private?
Maka tidak akan bisa di access tanpa method getter setter dari class yg sama 
4. Pada Eksperimen 1, apakah output berubah ketika super.phi diganti this.phi? Jelaskan mengapa.
Tidak,karena memang outputnya ditentukan oleh input dari parameter pi pada class MainPercobaan
5. Pada Eksperimen 2, mengapa r, this.r, dan super.r menghasilkan nilai yang berbeda? Pada kondisi apa awalan super. menjadi wajib dipakai?
Karena di set di awal bahwa super sudah di set pada 10 dan this.r dan r di inisialisasi pada 5

## Pertanyaan Percobaan 4
1. Sebutkan class yang berperan sebagai superclass dan subclass pada percobaan ini beserta alasannya. Mengapa ClassB disebut berperan ganda?
Pada classA dia adalah superclass dari classB dan classB adalah subclass nya,pada ClassB dia adalah superclass pada classC dan classC adalah subclass nya dan pada classC dia adalah subclass dari classB
2. Program hanya membuat satu objek (new ClassC()), tetapi tiga baris tercetak. Jelaskan mengapa konstruktor ClassA dan ClassB ikut dijalankan.
Karena ada extends beruntun dimana ketika objek classC dijalankan classB juga akan ikut jalan karena merupakan extends nya dan class A juga akan ikut jalan karena merupakan extends dari classB
3. Pada Modifikasi 1, mengapa output tidak berbeda dari sebelumnya meskipun super(); ditambahkan secara eksplisit?
Karena tidak ada method dari class manapun yang diambil melainkan langsung pada system.out.println sehingga super() tidak diperlukan
4. Pada Modifikasi 2 terjadi error. Aturan apa yang dilanggar, dan mengapa Java menetapkan aturan tersebut?
Karena super() harus berada pada urutan pertama sebelum statement pertama,jadi urutan eksekusinya adalah parent class -> child class
5. Tuliskan urutan proses (bernomor) yang terjadi ketika new ClassC() dieksekusi, dimulai dari pemanggilan konstruktor ClassC hingga seluruh output tercetak.

## Pertanyaan Percobaan 5
1. Jelaskan fungsi super(merk, memory, cpu) pada konstruktor Desktop. Atribut apa saja yang diisi oleh baris tersebut, dan atribut apa yang diisi oleh baris berikutnya?
Untuk mendeklarasi class Desktop dengan mengambil beberapa atribut pada parent class
2. Pada Eksperimen 1, mengapa error muncul di sini, padahal pada Percobaan 4 super() juga tidak ditulis tetapi program tetap berjalan?
Karena tanpa pemanggilan super() tidak akan ada parameter yang berisi atribut yang diambil dari parent class
3. Method showInfo() ditulis di Komputer sekaligus di Desktop. Apa istilah untuk kondisi ini? Apa yang tercetak bila baris super.showInfo(); pada Desktop dihapus?
18
Override.Apabila baris super.showinfo() tidak ditulis maka yang ada hanya akan menampilkan baris printer pada desktop
4. Pada Eksperimen 2, jelaskan perbedaan hasil kompilasi dengan dan tanpa @Override. Apa manfaat menuliskan @Override?
Tanpa Override kompilasinya akan lolos tapi method showInfo() akan menjadi method baru jadinya method nya hanya akan menampilkan dari parent class
5. Tantangan. Buat class Workstation sebagai turunan Desktop dengan atribut gpu (String).Class ini harus menimpa showInfo() sehingga menampilkan seluruh informasi Desktop ditambah baris GPU. Ketika new Workstation(...) dibuat, konstruktor class apa saja yang terpanggil, dan dalam urutan apa?


