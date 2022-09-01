// membuat perhitungan 
class Perhitungan {
    public static void main(String[] args){
        int variable1 = 20;
        int variable2 = 10;
        int hasil;
        //penjumlahan
        hasil = variable1 + variable2;
        System.out.println(variable1 + "+" + variable2 +"=" + hasil);
        //penjumlahan langsung hasil
        System.out.println(hasil);
        //pengurangan
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n",variable1,variable2,hasil);
	//perkalian
	hasil = variable1 * variable2;
	System.out.printf("%d x %d = %d \n",variable1,variable2,hasil);
	//pembagian
	hasil = variable1 / variable2;
	System.out.printf("%d / %d = %d \n",variable1,variable2,hasil);
	//modulus
        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n",variable1,variable2,hasil);

    }
}
