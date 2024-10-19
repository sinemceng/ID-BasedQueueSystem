public class TCKN {
    private long id;
    private String birthPlace;
    private String tckn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getTckn() {
        return tckn;
    }
    boolean kontrol = true;
    public void setTckn(String tckn) {
        if(tckn.length()==11){
            for (int i = 0; i < tckn.length(); i++) {
               char karakter = tckn.charAt(i);
               if(Character.isDigit(karakter)){
                   kontrol=true;
               }else{
                   kontrol=false;
                   break;
               }
            }
           if(kontrol){
               this.tckn= tckn;
               sonucuYazdir("TC başarıyla kaydedildi: "+ tckn);
           }else{
               sonucuYazdir("TC yalnızca rakamlardan oluşmalıdır.");
           }
        } else{
           sonucuYazdir("TC 11 karakter olmak zorundadir.");
        }
        this.tckn = tckn;
    }
    public void sonucuYazdir(String sonuc){
        System.out.println(sonuc);
    }
}
