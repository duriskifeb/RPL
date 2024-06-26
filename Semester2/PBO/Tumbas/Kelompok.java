    package Semester2.PBO.Tumbas;

    public class Kelompok {
        String nama;
        Lomba lomba;

        public Kelompok(String nama, Lomba lomba) {
            this.nama = nama;
            this.lomba = lomba;
        }

        @Override
        public String toString() {
            if (lomba.getClass().getSimpleName().equals("Lomba")) {
                return "\nNama: " + nama + "\nJenis lomba: Belum memilih lomba" + "\nNilai: " + lomba.getHasil()
                        + "\nDetail: " + lomba.toString();
            }
            return "\nNama: " + nama + "\nJenis lomba: " + lomba.getClass().getSimpleName() + "\nNilai: "
                    + lomba.getHasil()
                    + "\nDetail: " + lomba.toString();
        }

        public String toDatabaseString() {
            return nama + ", " + lomba.getClass().getSimpleName() + ", " + lomba.getHasil() + ", " + lomba.toString();
        }

        public String getNama() {
            return nama;
        }

        public Lomba getLomba() {
            return lomba;
        }

        public void setLomba(Lomba lombaBaru) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setLomba'");
        }
    }