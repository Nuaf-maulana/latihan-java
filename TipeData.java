// tipe data perimitif
class TipeData{
    public static void main(String[] args) {
        //tipe data di java
        //integer, byte, short, long, double, float, char, boolean
        //integer satuan
        int i = 10;
        System.out.println("=======INTEGR=======");
        System.out.println("nilai integer i =" +i);
        System.out.println("Nilai max =" +Integer.MAX_VALUE);
        System.out.println("Nilai min =" +Integer.MIN_VALUE);
        //kalao kita menggunakan nilai lenih dari max dan min milai akan berputar
        i=20;
        System.out.println("nilai i =" +(i + 2147483638));
        //menampilkan ukuran byate dan bir pada integer
        System.out.println("Besar integer =" +Integer.BYTES + "bytes");
        System.out.println("Besar integer =" +Integer.SIZE + "bit");
        //membuat nilai byte (satuan)
        byte b = 10;
        System.out.println("=======BYTE=======");
        System.out.println("nilai byte b =" +b);
        System.out.println("Nilai max =" +Byte.MAX_VALUE);
        System.out.println("Nilai min =" +Byte.MIN_VALUE);
        System.out.println("Besar byte =" +Byte.BYTES + "bytes");
        System.out.println("Besar byte =" +Byte.SIZE + "bit");
        
        //membuat nilai short (satuan)
        short c = 10;
        System.out.println("=======SHORT=======");
        System.out.println("nilai short c =" +c);
        System.out.println("Nilai max =" +Short.MAX_VALUE);
        System.out.println("Nilai min =" +Short.MIN_VALUE);
        System.out.println("Besar short =" +Short.BYTES + "bytes");
        System.out.println("Besar short =" +Short.SIZE + "bit");
        
        //membuat nilai long (satuan)
        long d = 10L;
        System.out.println("=======LONG=======");
        System.out.println("nilai long d =" +d);
        System.out.println("Nilai max =" +Long.MAX_VALUE);
        System.out.println("Nilai min =" +Long.MIN_VALUE);
        System.out.println("Besar long =" +Long.BYTES + "bytes");
        System.out.println("Besar long =" +Long.SIZE + "bit");
        
        //membuat nilai doubel (desimal)
        double e = -10.5d;
        System.out.println("=======DOUBLE=======");
        System.out.println("nilai double e =" +e);
        System.out.println("Nilai max =" +Double.MAX_VALUE);
        System.out.println("Nilai min =" +Double.MIN_VALUE);
        System.out.println("Besar double =" +Double.BYTES + "bytes");
        System.out.println("Besar double =" +Double.SIZE + "bit");
        
        //membuat nilai float (satuan)
        float  f = -8.5f;
        System.out.println("=======FLOAT=======");
        System.out.println("nilai float f =" +f);
        System.out.println("Nilai max =" +Float.MAX_VALUE);
        System.out.println("Nilai min =" +Float.MIN_VALUE);
        System.out.println("Besar float =" +Float.BYTES + "bytes");
        System.out.println("Besar float =" +Float.SIZE + "bit");
        
        //membuat nilai char (berdasarkan ASCII code)
        char g = 'c';
        System.out.println("=======CHAR=======");
        System.out.println("nilai char g =" +g);
        System.out.println("Nilai max =" +Character.MAX_VALUE);
        System.out.println("Nilai min =" +Character.MIN_VALUE);
        System.out.println("Besar char =" +Character.BYTES + "bytes");
        System.out.println("Besar char =" +Character.SIZE + "bit");
        
        //membuat nilai boolean (nilai true or false)
        boolean val= true;
        System.out.println("=======BOOLEAN=======");
        System.out.println("nilai boolean val =" + val);
        System.out.println("Nilai max =" +Boolean.TRUE);
        System.out.println("Nilai min =" +Boolean.FALSE);
       
        
    }
}
