/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pbo1.pkg10117161.rakapanji;

/**
 *
 * @author GPS-2
 */
public class ServicePrice {
    harga float pribadiLayanan, diskon;

    public float getPriceService () {
        return priceService;
    }

    public void setPriceService (float priceService) {
        this.priceService = priceService;
    }
    
    public void displayService () {
        System.out.println ("# ************************* #");
        System.out.println ("# *** Potongan Rambut Rock n Roll *** #");
        System.out.println ("# ******* Daftar Layanan ****** #");
        System.out.println ("1. Potongan Rambut: IDR 45K");
        System.out.println ("2. Potong Rambut + Cuci Rambut: IDR 55K");
        System.out.println ("3. Hanya Cuci Rambut: IDR 15K");
        System.out.println ("# ************************* #");
        System.out.print ("Pilih (1/2/3):");
    }
    
    public float getPrice (int serviceItem) {
        harga float = 0;
        
        switch (serviceItem) {
            kasus 1:
                harga = 45000;
                istirahat;
            kasus 2:
                harga = 55000;
                istirahat;
            kasus 3:
                harga = 15000;
                istirahat;
        }
        
        harga pengembalian;
    }
    
    public boolean checkMemberStatus (String statusMember) {
        status boolean = salah;
        
        statusMember = statusMember.toLowerCase ();
        if (statusMember.equals ("yes")) {
            status = benar;
        }
        
        status pengembalian;
    }
    
    public float getSale (boolean isMember, float parServicePrice) {
        penjualan mengambang = 0;
        
        if (isMember) {
            sale = parServicePrice * 10/100;
        }
        
        penjualan kembali;
    }
    
    public float getTotalPay (float priceService, diskon float) {
        return priceService - diskon;
    }
}