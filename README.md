# EksplorasiGUI3C
5 Komponen utama GUI 
1. Top-level Container Class (Jendela utama aplikasi. Semua komponen lain diletakkan di dalamnya. Top-level container adalah akar dari hierarki komponen)
2. Intermediate Container Class (Wadah perantara untuk mengelompokkan dan mengatur komponen. JPanel dipakai untuk judul, form, dan tombol)
3. Atomic Component Class (Komponen dasar yang berinteraksi langsung dengan pengguna dan tidak berisi komponen lain)
4. Layout Classes (BorderLayout : tata letak utama frame.
GridLayout : form input berbentuk grid 4 baris x 2 kolom.
FlowLayout : susunan judul dan tombol secara mengalir.)
5. Event Listener (ActionListener : tombol Simpan dan Reset.
MouseAdapter : efek hover pada tombol Simpan.
KeyAdapter : membatasi tipe data input.
WindowAdapter : dialog konfirmasi saat jendela ditutup.)
