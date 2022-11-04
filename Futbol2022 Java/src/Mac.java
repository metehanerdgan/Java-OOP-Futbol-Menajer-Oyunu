import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class  Mac {

    public void macoyna() {
        Scanner scanner = new Scanner(System.in);
        Oyuncu1 oyuncu1 = new Oyuncu1();
        Oyuncu2 oyuncu2 = new Oyuncu2();
        Premierlig pl = new Premierlig();
        Superlig sl = new Superlig();
        Laliga lg = new Laliga();
        Stadyumisim stadyumisim=new Stadyumisim();
        System.out.println("1.Oyuncunun Adını Giriniz : ");
        oyuncu1.ad1 = scanner.next();
        int guc1=0;
        String forma1="";
        String forma2="";
        String isim1="";
        String stadsec1="";
            System.out.println("Lig Seçiniz : ");
            System.out.println("-------1.Laliga---2.Premier Lig---3.Süper Lig-------");
        gir:
//1. Oyuncunun Seçimleri
        for (; ; ) {
            int ligsec1 = scanner.nextInt();
            //1. Oyuncunun Lig Seçimi
            switch (ligsec1) {
                case 1:
                    System.out.println("ID: " + lg.bc.id + "--Takım Adı: " + lg.bc.isim + "--- Güç: " + lg.bc.guc + "---Renkleri: " + lg.bc.renkleri + "---");
                    System.out.println("ID: " + lg.rm.id + "--Takım Adı: " + lg.rm.isim + "--- Güç: " + lg.rm.guc + "---Renkleri: " + lg.rm.renkleri + "---");
                    break;
                case 2:
                    System.out.println("ID: " + pl.lp.id + "--Takım Adı: " + pl.lp.isim + "--- Güç: " + pl.lp.guc + "---Renkleri: " + pl.lp.renkleri + "---");
                    System.out.println("ID: " + pl.mc.id + "--Takım Adı: " + pl.mc.isim + "--- Güç: " + pl.mc.guc + "---Renkleri: " + pl.mc.renkleri + "---");
                    break;
                case 3:
                    System.out.println("ID: " + sl.gs.id + "--Takım Adı: " + sl.gs.isim + "--- Güç: " + sl.gs.guc + "---Renkleri: " + sl.gs.renkleri + "---");
                    System.out.println("ID: " + sl.fb.id + "--Takım Adı: " + sl.fb.isim + "--- Güç: " + sl.fb.guc + "---Renkleri: " + sl.fb.renkleri + "---");
                    System.out.println("ID: " + sl.bjk.id + "--Takım Adı: " + sl.bjk.isim + "--- Güç: " + sl.bjk.guc + "---Renkleri: " + sl.bjk.renkleri + "---");
                    break;
                default:
                    System.out.println("Yanlış Değer Girdiniz!!!");
                    continue gir;
            }
                System.out.println("Takım Seçiniz : ");

            gir1:
//1. Oyuncunun Takım Seçimi
            for (;;){

                oyuncu1.takim1 = scanner.nextInt();
                if(ligsec1==1) {
                    switch (oyuncu1.takim1) {
                        case 1:
                            System.out.println(lg.bc.isim + " Takımını Seçtiniz");
                             guc1=lg.bc.guc;
                             isim1=lg.bc.isim;
                             stadsec1= stadyumisim.barcelonastad;
                             forma1= lg.bc.renkleri;
                            break ;
                        case 2:
                            System.out.println(lg.rm.isim + " Takımını Seçtiniz");
                             guc1=lg.rm.guc;
                            isim1=lg.rm.isim;
                            stadsec1=stadyumisim.realmadridstad;
                            forma1= lg.rm.renkleri;
                            break ;
                        default:
                            System.out.println("Yanlış Değer Girdiniz!!!");
                            continue gir1;
                    }
                }
                else if(ligsec1==2) {
                    switch (oyuncu1.takim1) {
                        case 3:
                            System.out.println(pl.lp.isim + " Takımını Seçtiniz");
                            guc1=pl.lp.guc;
                            isim1=pl.lp.isim;
                            stadsec1=stadyumisim.liverpoolstad;
                            forma1= pl.lp.renkleri;
                            break ;
                        case 4:
                            System.out.println(pl.mc.isim + " Takımını Seçtiniz");
                            guc1=pl.mc.guc;
                            isim1=pl.mc.isim;
                            stadsec1=stadyumisim.manchestercitystad;
                            forma1= pl.mc.renkleri;
                            break ;
                        default:
                            System.out.println("Yanlış Değer Girdiniz!!!");
                            continue gir1;
                    }
                }
                else if(ligsec1==3) {
                    switch (oyuncu1.takim1) {
                        case 5:
                            System.out.println(sl.gs.isim + " Takımını Seçtiniz");
                            guc1=sl.gs.guc;
                            isim1=sl.gs.isim;
                            stadsec1=stadyumisim.galatasaraystad;
                            forma1=sl.gs.renkleri;
                            break ;
                        case 6:
                            System.out.println(sl.fb.isim + " Takımını Seçtiniz");
                            guc1=sl.fb.guc;
                            isim1=sl.fb.isim;
                            stadsec1=stadyumisim.fenerbahcestad;
                            forma1=sl.fb.renkleri;
                            break ;
                        case 7:
                            System.out.println(sl.bjk.isim + " Takımını Seçtiniz");
                            guc1=sl.bjk.guc;
                            isim1=sl.bjk.isim;
                            stadsec1=stadyumisim.beşiktasstad;
                            forma1=sl.bjk.renkleri;
                            break ;
                        default:
                            System.out.println("Yanlış Değer Girdiniz!!!");
                            continue gir1;
                    }
                }
                   break ;
                            }
            break ;

                        }
        System.out.println("2.Oyuncunun Adını Giriniz : ");
        oyuncu2.ad2 = scanner.next();
        int guc2=0;
        String isim2="";
        String stadsec2 = "";
            System.out.println("Lig Seçiniz : ");
            System.out.println("-------1.Laliga---2.Premier Lig---3.Süper Lig-------");
        gir2:
//2.Oyuncunun Seçimleri
        for (; ; ) {
            int ligsec2 = scanner.nextInt();
            //2. Oyuncunun Lig Seçimi
            switch (ligsec2) {
                case 1:
                    System.out.println("ID: " + lg.bc.id + "--Takım Adı: " + lg.bc.isim + "--- Güç: " + lg.bc.guc + "---Renkleri: " + lg.bc.renkleri + "---");
                    System.out.println("ID: " + lg.rm.id + "--Takım Adı: " + lg.rm.isim + "--- Güç: " + lg.rm.guc + "---Renkleri: " + lg.rm.renkleri + "---");
                    break;
                case 2:
                    System.out.println("ID: " + pl.lp.id + "--Takım Adı: " + pl.lp.isim + "--- Güç: " + pl.lp.guc + "---Renkleri: " + pl.lp.renkleri + "---");
                    System.out.println("ID: " + pl.mc.id + "--Takım Adı: " + pl.mc.isim + "--- Güç: " + pl.mc.guc + "---Renkleri: " + pl.mc.renkleri + "---");
                    break;
                case 3:
                    System.out.println("ID: " + sl.gs.id + "--Takım Adı: " + sl.gs.isim + "--- Güç: " + sl.gs.guc + "---Renkleri: " + sl.gs.renkleri + "---");
                    System.out.println("ID: " + sl.fb.id + "--Takım Adı: " + sl.fb.isim + "--- Güç: " + sl.fb.guc + "---Renkleri: " + sl.fb.renkleri + "---");
                    System.out.println("ID: " + sl.bjk.id + "--Takım Adı: " + sl.bjk.isim + "--- Güç: " + sl.bjk.guc + "---Renkleri: " + sl.bjk.renkleri + "---");
                    break;
                default:
                    System.out.println("Yanlış Değer Girdiniz Lütfen Doğru Bir Değer Giriniz!!!");
                    continue gir2;
            }
                System.out.println("Takım Seçiniz : ");

            gir3:

            for (;;){

                oyuncu2.takim2 = scanner.nextInt();
                //2. Oyuncunun Takım Seçimi
                if(ligsec2==1) {
                    switch (oyuncu2.takim2) {
                        case 1:
                            System.out.println(lg.bc.isim + " Takımını Seçtiniz");
                            guc2=lg.bc.guc;
                            isim2=lg.bc.isim;
                            stadsec2=stadyumisim.barcelonastad;
                            forma2=lg.bc.renkleri;
                            break ;
                        case 2:
                            System.out.println(lg.rm.isim + " Takımını Seçtiniz");
                            guc2=lg.rm.guc;
                            isim2=lg.rm.isim;
                            stadsec2=stadyumisim.realmadridstad;
                            forma2=lg.rm.renkleri;
                            break ;
                        default:
                            System.out.println("Yanlış Değer Girdiniz Lütfen Doğru Bir Değer Giriniz!!!");
                            continue gir3;
                    }
                }
                else if(ligsec2==2) {
                    switch (oyuncu2.takim2) {
                        case 3:
                            System.out.println(pl.lp.isim + " Takımını Seçtiniz");
                            guc2=pl.lp.guc;
                            isim2=pl.lp.isim;
                            stadsec2=stadyumisim.liverpoolstad;
                            forma2=pl.lp.renkleri;
                            break ;
                        case 4:
                            System.out.println(pl.mc.isim + " Takımını Seçtiniz");
                            guc2=pl.mc.guc;
                            isim2=pl.mc.isim;
                            stadsec2=stadyumisim.manchestercitystad;
                            forma2=pl.mc.renkleri;
                            break ;
                        default:
                            System.out.println("Yanlış Değer Girdiniz Lütfen Doğru Bir Değer Giriniz!!!");
                            continue gir3;
                    }
                }
                else if(ligsec2==3) {
                    switch (oyuncu2.takim2) {
                        case 5:
                            System.out.println(sl.gs.isim + " Takımını Seçtiniz");
                            guc2=sl.gs.guc;
                            isim2=sl.gs.isim;
                            stadsec2=stadyumisim.galatasaraystad;
                            forma2=sl.gs.renkleri;
                            break ;
                        case 6:
                            System.out.println(sl.fb.isim + " Takımını Seçtiniz");
                            guc2=sl.fb.guc;
                            isim2=sl.fb.isim;
                            stadsec2=stadyumisim.fenerbahcestad;
                            forma2=sl.fb.renkleri;
                            break ;
                        case 7:
                            System.out.println(sl.bjk.isim + " Takımını Seçtiniz");
                            guc2=sl.bjk.guc;
                            isim2=sl.bjk.isim;
                            stadsec2=stadyumisim.beşiktasstad;
                            forma2= sl.bjk.renkleri;
                            break ;
                        default:
                            System.out.println("Yanlış Değer Girdiniz Lütfen Doğru Bir Değer Giriniz!!!");
                            continue gir3;
                    }
                }
                break ;
            }
            break ;

        }
        System.out.println("Turnuva Oynamak İster Misin ? (E/H)");
        int say1=0;
        int say2=0;
        String turnuvasecim=scanner.next();
        if(turnuvasecim.equals("E")||turnuvasecim.equals("e")) {
            int top1=0;
            int top2=0;
            System.out.println("Kaç EL  Oynamak İstersin ?");
            int tursayisi=scanner.nextInt();
            for (int i = 0; i < tursayisi; i++) {
                String stad1 = "";
//Stad Seçimi
                System.out.println("Stadyum Seçiniz : ");
                System.out.println("1: " + stadyumisim.barcelonastad + "\n2 :" + stadyumisim.realmadridstad +
                        "\n3: " + stadyumisim.liverpoolstad + "\n4: " + stadyumisim.manchestercitystad
                        + "\n5: " + stadyumisim.galatasaraystad + "\n6: " + stadyumisim.fenerbahcestad + "\n7: " + stadyumisim.beşiktasstad);
                gir4:
//Spiker Sunumu
                for (; ; ) {
                    int stad = scanner.nextInt();

                    switch (stad) {
                        case 1:
                            stad1 = stadyumisim.barcelonastad;
                            break;
                        case 2:
                            stad1 = stadyumisim.realmadridstad;
                            break;
                        case 3:
                            stad1 = stadyumisim.liverpoolstad;
                            break;
                        case 4:
                            stad1 = stadyumisim.manchestercitystad;
                            break;
                        case 5:
                            stad1 = stadyumisim.galatasaraystad;
                            break;
                        case 6:
                            stad1 = stadyumisim.fenerbahcestad;
                            break;
                        case 7:
                            stad1 = stadyumisim.beşiktasstad;
                            break;
                        default:
                            System.out.println("Yanlış Değer Girdiniz Lütfen Doğru Bir Değer Giriniz!!!");
                            continue gir4;
                    }
                    System.out.println("Evet Sayın Seyirciler Maça Başlamak İçin Önümüzde Bir Engel Kalmadı");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println(stad1 + " Stadı Tıklım Tıklım");
                    break;
                }
                System.out.println(oyuncu1.ad1 + " Adlı Oyuncu " + isim1 + " Takımıyla Oynarken " +
                        oyuncu2.ad2 + "  Adlı Oyuncu " + isim2 + " Takımıyla Oynuyor");
                //Güç Karşılaştırmasına Göre Spiker Yorumu
                if (Math.abs(guc2 - guc1) >= 5) {
                    if (guc1 > guc2) {
                        System.out.println(forma1 + " Takım Daha Güçlü Gözüksede " + forma2 + " Takım Kararlı Gözüküyor \nNe Olacağı Hiç Belli Olmaz Futbolun Heyecan Verici Kısmıda Bu");
                    } else if (guc2 > guc1) {
                        System.out.println(forma2 + " Takım Daha Güçlü Gözüksede " + forma1 + " Takım Kararlı Gözüküyor \nNe Olacağı Hiç Belli Olmaz Futbolun Heyecan Verici Kısmıda Bu");
                    }
                } else if (Math.abs(guc2 - guc1) <= 4) {
                    System.out.println(forma1 + " Takım ile " + forma2 + " Takım Arasında Büyük Çekişme Olucak Gibi Gözüküyor Çok Denk Takımlar Karşı karşıya");
                }
                System.out.println(isim1 + " VS " + isim2);
                //Ev Sahibi Yada Deplasman Olma Durumuna Göre Spiker Yorumu
                if (stad1 == stadsec1) {
                    System.out.println("Evet Ev Sahibi " + isim1 + " Takımı Bugün " + isim2 + " Takımını Ağırlıyor İki Takımada Bol Şanslar...");
                } else if (stad1 == stadsec2) {
                    System.out.println("Evet Ev Sahibi " + isim2 + " Takımı Bugün " + isim1 + " Takımını Ağırlıyor İki Takımada Bol Şanslar...");
                } else {
                    System.out.println("Evet Bugün İki Takımda Başka Bir Stadta Maç Oynuyor Bugün...");

                }
                System.out.println("Maça Başla(E/H)");
                gir5:
//Maç Gidişatı
                for (; ; ) {
                    String yesno = scanner.next();
                    if (yesno.equals("E") || yesno.equals("e")) {
                        int sayac = 0;
                        boolean atak = true;
                        int gol1 = 0;
                        int gol2 = 0;
                        //ilk Yarı Maç
                        while (sayac <= 45) {
                            Random rd=new Random();
                            int macsayac= rd.nextInt(6,16);
                            //  Gol Atma İstatistiklerinin Hesaplandığı Bölüm
                            if (stad1 == stadsec1) {
                                if (Math.abs(guc2 - guc1) >= 5) {

                                    if (guc1 > guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd1 = rnd.nextInt(0, 11);
                                            if (rnd1 == 1 || rnd1 == 2 || rnd1 == 3 || rnd1 == 4 || rnd1 == 5 || rnd1 == 6 || rnd1 == 7) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd1 == 8 || rnd1 == 9 || rnd1 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd8 = rnd.nextInt(0, 11);
                                            if (rnd8 == 1 || rnd8 == 2 || rnd8 == 3 || rnd8 == 4 || rnd8 == 5 || rnd8 == 6 || rnd8 == 7) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd8 == 8 || rnd8 == 9 || rnd8 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    } else if (guc2 > guc1) {
                                        if (atak == true) {
                                            Random rnd = new Random();

                                            int rnd2 = rnd.nextInt(0, 11);
                                            if (rnd2 == 1 || rnd2 == 2 || rnd2 == 3 || rnd2 == 4) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd2 == 5 || rnd2 == 6 || rnd2 == 7 || rnd2 == 8 || rnd2 == 9 || rnd2 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd9 = rnd.nextInt(0, 11);
                                            if (rnd9 == 1 || rnd9 == 2 || rnd9 == 3 || rnd9 == 4) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                atak = true;
                                                sayac += macsayac;
                                            } else if (rnd9 == 5 || rnd9 == 6 || rnd9 == 7 || rnd9 == 8 || rnd9 == 9 || rnd9 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                atak = true;
                                                sayac += macsayac;
                                            }
                                        }
                                    }
                                } else if (Math.abs(guc2 - guc1) <= 4) {
                                    if (guc1 > guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd1 = rnd.nextInt(0, 11);
                                            if (rnd1 == 1 || rnd1 == 2 || rnd1 == 3 || rnd1 == 4 || rnd1 == 5 || rnd1 == 6) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd1 == 7 || rnd1 == 8 || rnd1 == 9 || rnd1 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        }
                                        else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd8 = rnd.nextInt(0, 11);
                                            if (rnd8 == 1 || rnd8 == 2 || rnd8 == 3 || rnd8 == 4 || rnd8 == 5 || rnd8 == 6) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd8 == 7 || rnd8 == 8 || rnd8 == 9 || rnd8 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    }
                                    else if (guc2 > guc1) {
                                        if (atak == true) {
                                            Random rnd = new Random();

                                            int rnd2 = rnd.nextInt(0, 12);
                                            if (rnd2 == 1 || rnd2 == 2 || rnd2 == 3 || rnd2 == 4 || rnd2 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd2 == 5 || rnd2 == 6 || rnd2 == 7 || rnd2 == 8 || rnd2 == 9 || rnd2 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        }
                                        else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd9 = rnd.nextInt(0, 12);
                                            if (rnd9 == 1 || rnd9 == 2 || rnd9 == 3 || rnd9 == 4 || rnd9 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;

                                            } else if (rnd9 == 5 || rnd9 == 6 || rnd9 == 7 || rnd9 == 8 || rnd9 == 9 || rnd9 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;

                                            }
                                        }
                                    }
                                    else if (guc1 == guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd3 = rnd.nextInt(0, 12);
                                            if (rnd3 == 1 || rnd3 == 2 || rnd3 == 3 || rnd3 == 4 || rnd3 == 5 || rnd3 == 6) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd3 == 7 || rnd3 == 8 || rnd3 == 9 || rnd3 == 10 || rnd3 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        }
                                        else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd10 = rnd.nextInt(0, 11);
                                            if (rnd10 == 1 || rnd10 == 2 || rnd10 == 3 || rnd10 == 4 || rnd10 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd10 == 5 || rnd10 == 6 || rnd10 == 7 || rnd10 == 8 || rnd10 == 9 || rnd10 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    }
                                }
                            }
                            else if (stad1 == stadsec2) {
                                if (Math.abs(guc2 - guc1) >= 5) {

                                    if (guc2 > guc1) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd5 = rnd.nextInt(0, 11);
                                            if (rnd5 == 1 || rnd5 == 2 || rnd5 == 3) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd5 == 4 || rnd5 == 5 || rnd5 == 6 || rnd5 == 7 || rnd5 == 8 || rnd5 == 9 || rnd5 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd11 = rnd.nextInt(0, 11);
                                            if (rnd11 == 1 || rnd11 == 2 || rnd11 == 3 || rnd11 == 4 || rnd11 == 5 || rnd11 == 6 || rnd11 == 7) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd11 == 8 || rnd11 == 9 || rnd11 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        }
                                    } else if (guc1 > guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd6 = rnd.nextInt(0, 11);
                                            if (rnd6 == 1 || rnd6 == 2 || rnd6 == 3 || rnd6 == 4 || rnd6 == 5 || rnd6 == 6) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd6 == 7 || rnd6 == 8 || rnd6 == 9 || rnd6 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd12 = rnd.nextInt(0, 11);
                                            if (rnd12 == 1 || rnd12 == 2 || rnd12 == 3 || rnd12 == 4 || rnd12 == 5 || rnd12 == 6) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd12 == 7 || rnd12 == 8 || rnd12 == 9 || rnd12 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    }
                                } else if (Math.abs(guc2 - guc1) <= 4) {
                                    if (guc2 > guc1) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd5 = rnd.nextInt(0, 11);
                                            if (rnd5 == 1 || rnd5 == 2 || rnd5 == 3 || rnd5 == 4) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd5 == 5 || rnd5 == 6 || rnd5 == 7 || rnd5 == 8 || rnd5 == 9 || rnd5 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd11 = rnd.nextInt(0, 11);
                                            if (rnd11 == 1 || rnd11 == 2 || rnd11 == 3 || rnd11 == 4 || rnd11 == 5 || rnd11 == 6) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd11 == 7 || rnd11 == 8 || rnd11 == 9 || rnd11 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        }
                                    } else if (guc1 > guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd6 = rnd.nextInt(0, 11);
                                            if (rnd6 == 1 || rnd6 == 2 || rnd6 == 3 || rnd6 == 4 || rnd6 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd6 == 6 || rnd6 == 7 || rnd6 == 8 || rnd6 == 9 || rnd6 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd12 = rnd.nextInt(0, 11);
                                            if (rnd12 == 1 || rnd12 == 2 || rnd12 == 3 || rnd12 == 4 || rnd12 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd12 == 6 || rnd12 == 7 || rnd12 == 8 || rnd12 == 9 || rnd12 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    } else if (guc1 == guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd7 = rnd.nextInt(0, 12);
                                            if (rnd7 == 1 || rnd7 == 2 || rnd7 == 3 || rnd7 == 4 || rnd7 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd7 == 5 || rnd7 == 6 || rnd7 == 7 || rnd7 == 8 || rnd7 == 9 || rnd7 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd13 = rnd.nextInt(0, 12);
                                            if (rnd13 == 1 || rnd13 == 2 || rnd13 == 3 || rnd13 == 4 || rnd13 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd13 == 5 || rnd13 == 6 || rnd13 == 7 || rnd13 == 8 || rnd13 == 9 || rnd13 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }

                                        }
                                    }
                                }

                            }
                            else {
                                if (Math.abs(guc2 - guc1) >= 5) {
                                    if (guc2 > guc1) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd5 = rnd.nextInt(0, 12);
                                            if (rnd5 == 1 || rnd5 == 2 || rnd5 == 3 || rnd5 == 4 || rnd5 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd5 == 6 || rnd5 == 7 || rnd5 == 8 || rnd5 == 9 || rnd5 == 10 || rnd5 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd14 = rnd.nextInt(0, 12);
                                            if (rnd14 == 6 || rnd14 == 7 || rnd14 == 8 || rnd14 == 9 || rnd14 == 10 || rnd14 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd14 == 1 || rnd14 == 2 || rnd14 == 3 || rnd14 == 4 || rnd14 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    } else if (guc1 > guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd6 = rnd.nextInt(0, 12);
                                            if (rnd6 == 1 || rnd6 == 2 || rnd6 == 3 || rnd6 == 4 || rnd6 == 5 || rnd6 == 6) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd6 == 7 || rnd6 == 8 || rnd6 == 9 || rnd6 == 10 || rnd6 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd15 = rnd.nextInt(0, 12);
                                            if (rnd15 == 1 || rnd15 == 2 || rnd15 == 3 || rnd15 == 4 || rnd15 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd15 == 6 || rnd15 == 7 || rnd15 == 8 || rnd15 == 9 || rnd15 == 10 || rnd15 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    } else if (guc1 == guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd7 = rnd.nextInt(0, 11);
                                            if (rnd7 == 1 || rnd7 == 2 || rnd7 == 3 || rnd7 == 4 || rnd7 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd7 == 6 || rnd7 == 7 || rnd7 == 8 || rnd7 == 9 || rnd7 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd16 = rnd.nextInt(0, 11);
                                            if (rnd16 == 1 || rnd16 == 2 || rnd16 == 3 || rnd16 == 4 || rnd16 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd16 == 6 || rnd16 == 7 || rnd16 == 8 || rnd16 == 9 || rnd16 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }

                                    }

                                } else if (Math.abs(guc2 - guc1) <= 4) {
                                    if (guc2 > guc1) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd5 = rnd.nextInt(0, 14);
                                            if (rnd5 == 1 || rnd5 == 2 || rnd5 == 3 || rnd5 == 4 || rnd5 == 5 || rnd5 == 12) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd5 == 6 || rnd5 == 7 || rnd5 == 8 || rnd5 == 9 || rnd5 == 10 || rnd5 == 11 || rnd5 == 13) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd14 = rnd.nextInt(0, 14);
                                            if (rnd14 == 6 || rnd14 == 7 || rnd14 == 8 || rnd14 == 9 || rnd14 == 10 || rnd14 == 11 || rnd14 == 12) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd14 == 1 || rnd14 == 2 || rnd14 == 3 || rnd14 == 4 || rnd14 == 5 || rnd14 == 13) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    } else if (guc1 > guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd6 = rnd.nextInt(0, 14);
                                            if (rnd6 == 1 || rnd6 == 2 || rnd6 == 3 || rnd6 == 4 || rnd6 == 5 || rnd6 == 6 || rnd6 == 12) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd6 == 7 || rnd6 == 8 || rnd6 == 9 || rnd6 == 10 || rnd6 == 11 || rnd6 == 13) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd15 = rnd.nextInt(0, 14);
                                            if (rnd15 == 1 || rnd15 == 2 || rnd15 == 3 || rnd15 == 4 || rnd15 == 5 || rnd15 == 12) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd15 == 6 || rnd15 == 7 || rnd15 == 8 || rnd15 == 9 || rnd15 == 10 || rnd15 == 11 || rnd15 == 13) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    } else if (guc1 == guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd7 = rnd.nextInt(0, 11);
                                            if (rnd7 == 1 || rnd7 == 2 || rnd7 == 3 || rnd7 == 4 || rnd7 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd7 == 6 || rnd7 == 7 || rnd7 == 8 || rnd7 == 9 || rnd7 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd16 = rnd.nextInt(0, 11);
                                            if (rnd16 == 1 || rnd16 == 2 || rnd16 == 3 || rnd16 == 4 || rnd16 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd16 == 6 || rnd16 == 7 || rnd16 == 8 || rnd16 == 9 || rnd16 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }

                                    }
                                }


                            }


                        }
                        //Skor Tablosuna Göre Spiker Yorumu
                        System.out.println("Evet Sayın Seyirciler İlk Yarı Sonucu : " + isim1 + ": " + gol1 + " " + isim2 + ": " + gol2);
                        if (Math.abs(gol1 - gol2) >= 3) {
                            if (gol1 > gol2) {
                                System.out.println(isim1 + " İlk Yarıyı Önde Bitiriyor.");
                                System.out.println(oyuncu1.ad1 + " Adlı Oyuncu Oyuncu Değişikliği Hakkı Kazandınız Kullanmak İstiyor Musunuz.(E/H)");
                                String a = scanner.next();
                                if (a.equals("E") || a.equals("e")) {
                                    guc2 -= 1;
                                    guc1 += 1;
                                } else if (a.equals("H") || a.equals("h")) {
                                    guc1 = guc1;
                                }
                            }
                            else if (gol2 > gol1) {
                                System.out.println(isim2 + " İlk Yarıyı Önde Bitiriyor.");
                                System.out.println(oyuncu2.ad2 + " Oyuncu Değişikliği Hakkı Kazandınız Kullanmak İstiyor Musunuz.(E/H)");
                                String a = scanner.next();
                                if (a.equals("E") || a.equals("e")) {
                                    guc1 -= 1;
                                    guc2 += 1;
                                } else if (a.equals("H") || a.equals("h")) {
                                    guc2 = guc2;
                                }
                            }
                            else if (gol1 == gol2) {
                                if (gol1 == 0 && gol2 == 0) {
                                    System.out.println("İlk Yarıda İki Takımdanda Gol Sesi Çıkmadı.");
                                } else {
                                    System.out.println("İlk Yarı Berabere Bitti İki Takımda Çok Çekişmeli Bir Oyun Sergiliyor.");
                                }
                                guc1 -= 1;
                                guc2 -= 1;
                            }
                        }
                        else if (Math.abs(gol1 - gol2) < 3) {
                            if (gol1 > gol2) {
                                System.out.println(isim1 + " İlk Yarıyı Önde Bitiriyor.");
                                System.out.println(oyuncu1.ad1 + " Adlı Oyuncu Oyuncu Değişikliği Hakkı Kazandınız Kullanmak İstiyor Musunuz.(+1 Güç)(E/H)");
                                String a = scanner.next();
                                if (a.equals("E") || a.equals("e")) {
                                    guc1 += 1;
                                } else if (a.equals("H") || a.equals("h")) {
                                    guc1 = guc1;
                                }
                            }
                            else if (gol2 > gol1) {
                                System.out.println(isim2 + " İlk Yarıyı Önde Bitiriyor.");
                                System.out.println(oyuncu2.ad2 + " Oyuncu Değişikliği Hakkı Kazandınız Kullanmak İstiyor Musunuz(+1 Güç).(E/H)");
                                String a = scanner.next();
                                if (a.equals("E") || a.equals("e")) {
                                    guc2 += 1;
                                } else if (a.equals("H") || a.equals("h")) {
                                    guc2 = guc2;
                                }
                            }
                            else if (gol1 == gol2) {
                                if (gol1 == 0 && gol2 == 0) {
                                    System.out.println("İlk Yarıda İki Takımdanda Gol Sesi Çıkmadı.");
                                }
                                else {
                                    System.out.println("İlk Yarı Berabere Bitti İki Takımda Çok Çekişmeli Bir Oyun Sergiliyor.");
                                }
                                guc1 -= 1;
                                guc2 -= 1;
                            }
                        }
                        //İkinci Yarı Maç
                        while (sayac <= 90) {
                            Random rt=new Random();
                            int macsayac=rt.nextInt(6,16);
                            //  Gol Atma İstatistiklerinin Hesaplandığı Bölüm
                            if (stad1 == stadsec1) {
                                if (Math.abs(guc2 - guc1) >= 5) {

                                    if (guc1 > guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd1 = rnd.nextInt(0, 11);
                                            if (rnd1 == 1 || rnd1 == 2 || rnd1 == 3 || rnd1 == 4 || rnd1 == 5 || rnd1 == 6 || rnd1 == 7) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd1 == 8 || rnd1 == 9 || rnd1 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        }
                                        else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd8 = rnd.nextInt(0, 11);
                                            if (rnd8 == 1 || rnd8 == 2 || rnd8 == 3 || rnd8 == 4 || rnd8 == 5 || rnd8 == 6 || rnd8 == 7) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd8 == 8 || rnd8 == 9 || rnd8 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    }
                                    else if (guc2 > guc1) {
                                        if (atak == true) {
                                            Random rnd = new Random();

                                            int rnd2 = rnd.nextInt(0, 11);
                                            if (rnd2 == 1 || rnd2 == 2 || rnd2 == 3 || rnd2 == 4) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd2 == 5 || rnd2 == 6 || rnd2 == 7 || rnd2 == 8 || rnd2 == 9 || rnd2 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd9 = rnd.nextInt(0, 11);
                                            if (rnd9 == 1 || rnd9 == 2 || rnd9 == 3 || rnd9 == 4) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                atak = true;
                                                sayac += macsayac;
                                            } else if (rnd9 == 5 || rnd9 == 6 || rnd9 == 7 || rnd9 == 8 || rnd9 == 9 || rnd9 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                atak = true;
                                                sayac += macsayac;
                                            }
                                        }
                                    }
                                }
                                else if (Math.abs(guc2 - guc1) <= 4) {
                                    if (guc1 > guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd1 = rnd.nextInt(0, 11);
                                            if (rnd1 == 1 || rnd1 == 2 || rnd1 == 3 || rnd1 == 4 || rnd1 == 5 || rnd1 == 6) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd1 == 7 || rnd1 == 8 || rnd1 == 9 || rnd1 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd8 = rnd.nextInt(0, 11);
                                            if (rnd8 == 1 || rnd8 == 2 || rnd8 == 3 || rnd8 == 4 || rnd8 == 5 || rnd8 == 6) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd8 == 7 || rnd8 == 8 || rnd8 == 9 || rnd8 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    } else if (guc2 > guc1) {
                                        if (atak == true) {
                                            Random rnd = new Random();

                                            int rnd2 = rnd.nextInt(0, 12);
                                            if (rnd2 == 1 || rnd2 == 2 || rnd2 == 3 || rnd2 == 4 || rnd2 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd2 == 5 || rnd2 == 6 || rnd2 == 7 || rnd2 == 8 || rnd2 == 9 || rnd2 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd9 = rnd.nextInt(0, 12);
                                            if (rnd9 == 1 || rnd9 == 2 || rnd9 == 3 || rnd9 == 4 || rnd9 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;

                                            } else if (rnd9 == 5 || rnd9 == 6 || rnd9 == 7 || rnd9 == 8 || rnd9 == 9 || rnd9 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;

                                            }
                                        }
                                    } else if (guc1 == guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd3 = rnd.nextInt(0, 12);
                                            if (rnd3 == 1 || rnd3 == 2 || rnd3 == 3 || rnd3 == 4 || rnd3 == 5 || rnd3 == 6) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd3 == 7 || rnd3 == 8 || rnd3 == 9 || rnd3 == 10 || rnd3 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd10 = rnd.nextInt(0, 11);
                                            if (rnd10 == 1 || rnd10 == 2 || rnd10 == 3 || rnd10 == 4 || rnd10 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd10 == 5 || rnd10 == 6 || rnd10 == 7 || rnd10 == 8 || rnd10 == 9 || rnd10 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    }
                                }
                            }
                            else if (stad1 == stadsec2) {
                                if (Math.abs(guc2 - guc1) >= 5) {

                                    if (guc2 > guc1) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd5 = rnd.nextInt(0, 11);
                                            if (rnd5 == 1 || rnd5 == 2 || rnd5 == 3) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd5 == 4 || rnd5 == 5 || rnd5 == 6 || rnd5 == 7 || rnd5 == 8 || rnd5 == 9 || rnd5 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd11 = rnd.nextInt(0, 11);
                                            if (rnd11 == 1 || rnd11 == 2 || rnd11 == 3 || rnd11 == 4 || rnd11 == 5 || rnd11 == 6 || rnd11 == 7) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd11 == 8 || rnd11 == 9 || rnd11 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        }
                                    } else if (guc1 > guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd6 = rnd.nextInt(0, 11);
                                            if (rnd6 == 1 || rnd6 == 2 || rnd6 == 3 || rnd6 == 4 || rnd6 == 5 || rnd6 == 6) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd6 == 7 || rnd6 == 8 || rnd6 == 9 || rnd6 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd12 = rnd.nextInt(0, 11);
                                            if (rnd12 == 1 || rnd12 == 2 || rnd12 == 3 || rnd12 == 4 || rnd12 == 5 || rnd12 == 6) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd12 == 7 || rnd12 == 8 || rnd12 == 9 || rnd12 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    }
                                } else if (Math.abs(guc2 - guc1) <= 4) {
                                    if (guc2 > guc1) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd5 = rnd.nextInt(0, 11);
                                            if (rnd5 == 1 || rnd5 == 2 || rnd5 == 3 || rnd5 == 4) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd5 == 5 || rnd5 == 6 || rnd5 == 7 || rnd5 == 8 || rnd5 == 9 || rnd5 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd11 = rnd.nextInt(0, 11);
                                            if (rnd11 == 1 || rnd11 == 2 || rnd11 == 3 || rnd11 == 4 || rnd11 == 5 || rnd11 == 6) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd11 == 7 || rnd11 == 8 || rnd11 == 9 || rnd11 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        }
                                    } else if (guc1 > guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd6 = rnd.nextInt(0, 11);
                                            if (rnd6 == 1 || rnd6 == 2 || rnd6 == 3 || rnd6 == 4 || rnd6 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd6 == 6 || rnd6 == 7 || rnd6 == 8 || rnd6 == 9 || rnd6 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd12 = rnd.nextInt(0, 11);
                                            if (rnd12 == 1 || rnd12 == 2 || rnd12 == 3 || rnd12 == 4 || rnd12 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd12 == 6 || rnd12 == 7 || rnd12 == 8 || rnd12 == 9 || rnd12 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    } else if (guc1 == guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd7 = rnd.nextInt(0, 12);
                                            if (rnd7 == 1 || rnd7 == 2 || rnd7 == 3 || rnd7 == 4 || rnd7 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd7 == 5 || rnd7 == 6 || rnd7 == 7 || rnd7 == 8 || rnd7 == 9 || rnd7 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd13 = rnd.nextInt(0, 12);
                                            if (rnd13 == 1 || rnd13 == 2 || rnd13 == 3 || rnd13 == 4 || rnd13 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd13 == 5 || rnd13 == 6 || rnd13 == 7 || rnd13 == 8 || rnd13 == 9 || rnd13 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }

                                        }
                                    }
                                }

                            }
                            else {
                                if (Math.abs(guc2 - guc1) >= 5) {
                                    if (guc2 > guc1) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd5 = rnd.nextInt(0, 12);
                                            if (rnd5 == 1 || rnd5 == 2 || rnd5 == 3 || rnd5 == 4 || rnd5 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd5 == 6 || rnd5 == 7 || rnd5 == 8 || rnd5 == 9 || rnd5 == 10 || rnd5 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd14 = rnd.nextInt(0, 12);
                                            if (rnd14 == 6 || rnd14 == 7 || rnd14 == 8 || rnd14 == 9 || rnd14 == 10 || rnd14 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd14 == 1 || rnd14 == 2 || rnd14 == 3 || rnd14 == 4 || rnd14 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    } else if (guc1 > guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd6 = rnd.nextInt(0, 12);
                                            if (rnd6 == 1 || rnd6 == 2 || rnd6 == 3 || rnd6 == 4 || rnd6 == 5 || rnd6 == 6) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd6 == 7 || rnd6 == 8 || rnd6 == 9 || rnd6 == 10 || rnd6 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd15 = rnd.nextInt(0, 12);
                                            if (rnd15 == 1 || rnd15 == 2 || rnd15 == 3 || rnd15 == 4 || rnd15 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd15 == 6 || rnd15 == 7 || rnd15 == 8 || rnd15 == 9 || rnd15 == 10 || rnd15 == 11) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    } else if (guc1 == guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd7 = rnd.nextInt(0, 11);
                                            if (rnd7 == 1 || rnd7 == 2 || rnd7 == 3 || rnd7 == 4 || rnd7 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd7 == 6 || rnd7 == 7 || rnd7 == 8 || rnd7 == 9 || rnd7 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd16 = rnd.nextInt(0, 11);
                                            if (rnd16 == 1 || rnd16 == 2 || rnd16 == 3 || rnd16 == 4 || rnd16 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd16 == 6 || rnd16 == 7 || rnd16 == 8 || rnd16 == 9 || rnd16 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }

                                    }

                                } else if (Math.abs(guc2 - guc1) <= 4) {
                                    if (guc2 > guc1) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd5 = rnd.nextInt(0, 14);
                                            if (rnd5 == 1 || rnd5 == 2 || rnd5 == 3 || rnd5 == 4 || rnd5 == 5 || rnd5 == 12) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd5 == 6 || rnd5 == 7 || rnd5 == 8 || rnd5 == 9 || rnd5 == 10 || rnd5 == 11 || rnd5 == 13) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd14 = rnd.nextInt(0, 14);
                                            if (rnd14 == 6 || rnd14 == 7 || rnd14 == 8 || rnd14 == 9 || rnd14 == 10 || rnd14 == 11 || rnd14 == 12) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd14 == 1 || rnd14 == 2 || rnd14 == 3 || rnd14 == 4 || rnd14 == 5 || rnd14 == 13) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    } else if (guc1 > guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd6 = rnd.nextInt(0, 14);
                                            if (rnd6 == 1 || rnd6 == 2 || rnd6 == 3 || rnd6 == 4 || rnd6 == 5 || rnd6 == 6 || rnd6 == 12) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd6 == 7 || rnd6 == 8 || rnd6 == 9 || rnd6 == 10 || rnd6 == 11 || rnd6 == 13) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd15 = rnd.nextInt(0, 14);
                                            if (rnd15 == 1 || rnd15 == 2 || rnd15 == 3 || rnd15 == 4 || rnd15 == 5 || rnd15 == 12) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd15 == 6 || rnd15 == 7 || rnd15 == 8 || rnd15 == 9 || rnd15 == 10 || rnd15 == 11 || rnd15 == 13) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }
                                    } else if (guc1 == guc2) {
                                        if (atak == true) {
                                            Random rnd = new Random();
                                            int rnd7 = rnd.nextInt(0, 11);
                                            if (rnd7 == 1 || rnd7 == 2 || rnd7 == 3 || rnd7 == 4 || rnd7 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol1++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            } else if (rnd7 == 6 || rnd7 == 7 || rnd7 == 8 || rnd7 == 9 || rnd7 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim1 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = false;
                                            }
                                        } else if (atak == false) {
                                            Random rnd = new Random();
                                            int rnd16 = rnd.nextInt(0, 11);
                                            if (rnd16 == 1 || rnd16 == 2 || rnd16 == 3 || rnd16 == 4 || rnd16 == 5) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("GOOOOOOOOOOOOOOOL...");
                                                gol2++;
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            } else if (rnd16 == 6 || rnd16 == 7 || rnd16 == 8 || rnd16 == 9 || rnd16 == 10) {
                                                System.out.println("Dakika : " + sayac);
                                                System.out.println("Atağa " + isim2 + " Başlıyor");
                                                System.out.println("Rakip Kaleye Bir Şut....");
                                                System.out.println("Az Farkla Dışarı...");
                                                System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                                sayac += macsayac;
                                                atak = true;
                                            }
                                        }

                                    }
                                }


                            }


                        }
                        top1+=gol1;
                        top2+=gol2;
                        System.out.println("Maç Sonucu :" + isim1 + ": " + gol1 + " " + isim2 + ": " + gol2);
                        if (gol1 > gol2) {
                            System.out.println("Maçı " + oyuncu1.ad1 + " Kazandı......");
                            System.out.println("Toplam Turnuva Gol Skoru: "+oyuncu1.ad1+": "+top1+"  "+oyuncu2.ad2+": "+top2);
                        }
                        else if (gol2 > gol1) {
                            System.out.println("Maçı " + oyuncu2.ad2 + " Kazandı......");
                            System.out.println("Toplam Turnuva Gol Skoru: "+oyuncu1.ad1+": "+top1+"  "+oyuncu2.ad2+": "+top2);
                        }
                        else if (gol1 == gol2) {
                            System.out.println("Berabere Bitii......");
                            System.out.println("Toplam Turnuva Gol Skoru: "+oyuncu1.ad1+": "+top1+"  "+oyuncu2.ad2+": "+top2);
                        }

                    }
                    else if (yesno.equals("H") || yesno.equals("h")) {
                        System.out.println("Hoşçakalın...");
                    }
                    else {
                        System.out.println("Yanlış Değer Girdiniz Lütfen Doğru Bir Değer Giriniz!!!");
                        continue gir5;
                    }
                    break;
                }


            }
            if(top1>top2)
            {
                System.out.println("Turnuvayı " + oyuncu1.ad1 + " Kazandı......");
                System.out.println("Toplam Turnuva Gol Sonucu: "+oyuncu1.ad1+": "+top1+"  "+oyuncu2.ad2+": "+top2);
            }
            else if(top2>top1)
            {
                System.out.println("Turnuvayı " + oyuncu2.ad2 + " Kazandı......");
                System.out.println("Toplam Turnuva Gol Sonucu: "+oyuncu1.ad1+": "+top1+"  "+oyuncu2.ad2+": "+top2);
            }
            else
            {
                    System.out.println("Turnuva Berabere Bitti");
                System.out.println("Toplam Turnuva Gol Sonucu: "+oyuncu1.ad1+": "+top1+"  "+oyuncu2.ad2+": "+top2);
            }
        }
        else if(turnuvasecim.equals("H")||turnuvasecim.equals("h"))
        {
            String stad1 = "";
//Stad Seçimi
            System.out.println("Stadyum Seçiniz : ");
            System.out.println("1: " + stadyumisim.barcelonastad + "\n2 :" + stadyumisim.realmadridstad +
                    "\n3: " + stadyumisim.liverpoolstad + "\n4: " + stadyumisim.manchestercitystad
                    + "\n5: " + stadyumisim.galatasaraystad + "\n6: " + stadyumisim.fenerbahcestad + "\n7: " + stadyumisim.beşiktasstad);
            gir4:
//Spiker Sunumu
            for (; ; ) {
                int stad = scanner.nextInt();

                switch (stad) {
                    case 1:
                        stad1 = stadyumisim.barcelonastad;
                        break;
                    case 2:
                        stad1 = stadyumisim.realmadridstad;
                        break;
                    case 3:
                        stad1 = stadyumisim.liverpoolstad;
                        break;
                    case 4:
                        stad1 = stadyumisim.manchestercitystad;
                        break;
                    case 5:
                        stad1 = stadyumisim.galatasaraystad;
                        break;
                    case 6:
                        stad1 = stadyumisim.fenerbahcestad;
                        break;
                    case 7:
                        stad1 = stadyumisim.beşiktasstad;
                        break;
                    default:
                        System.out.println("Yanlış Değer Girdiniz Lütfen Doğru Bir Değer Giriniz!!!");
                        continue gir4;
                }
                System.out.println("Evet Sayın Seyirciler Maça Başlamak İçin Önümüzde Bir Engel Kalmadı");
                System.out.println("-------------------------------------------------------------------");
                System.out.println(stad1 + " Stadı Tıklım Tıklım");
                break;
            }
            System.out.println(oyuncu1.ad1 + " Adlı Oyuncu " + isim1 + " Takımıyla Oynarken " +
                    oyuncu2.ad2 + "  Adlı Oyuncu " + isim2 + " Takımıyla Oynuyor");
            //Güç Karşılaştırmasına Göre Spiker Yorumu
            if (Math.abs(guc2 - guc1) >= 5) {
                if (guc1 > guc2) {
                    System.out.println(forma1 + " Takım Daha Güçlü Gözüksede " + forma2 + " Takım Kararlı Gözüküyor \nNe Olacağı Hiç Belli Olmaz Futbolun Heyecan Verici Kısmıda Bu");
                } else if (guc2 > guc1) {
                    System.out.println(forma2 + " Takım Daha Güçlü Gözüksede " + forma1 + " Takım Kararlı Gözüküyor \nNe Olacağı Hiç Belli Olmaz Futbolun Heyecan Verici Kısmıda Bu");
                }
            } else if (Math.abs(guc2 - guc1) <= 4) {
                System.out.println(forma1 + " Takım ile " + forma2 + " Takım Arasında Büyük Çekişme Olucak Gibi Gözüküyor Çok Denk Takımlar Karşı karşıya");
            }
            System.out.println(isim1 + " VS " + isim2);
            //Ev Sahibi Yada Deplasman Olma Durumuna Göre Spiker Yorumu
            if (stad1 == stadsec1) {
                System.out.println("Evet Ev Sahibi " + isim1 + " Takımı Bugün " + isim2 + " Takımını Ağırlıyor İki Takımada Bol Şanslar...");
            } else if (stad1 == stadsec2) {
                System.out.println("Evet Ev Sahibi " + isim2 + " Takımı Bugün " + isim1 + " Takımını Ağırlıyor İki Takımada Bol Şanslar...");
            } else {
                System.out.println("Evet Bugün İki Takımda Başka Bir Stadta Maç Oynuyor Bugün...");

            }
            System.out.println("Maça Başla(E/H)");
            gir5:
//Maç Gidişatı
            for (; ; ) {
                String yesno = scanner.next();
                if (yesno.equals("E") || yesno.equals("e")) {
                    int sayac = 0;
                    boolean atak = true;
                    int gol1 = 0;
                    int gol2 = 0;
                    //ilk Yarı Maç
                    while (sayac <= 45) {
                        Random re=new Random();
                        int macsayac =re.nextInt(6,16);
                        //  Gol Atma İstatistiklerinin Hesaplandığı Bölüm
                        if (stad1 == stadsec1) {
                            if (Math.abs(guc2 - guc1) >= 5) {

                                if (guc1 > guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd1 = rnd.nextInt(0, 11);
                                        if (rnd1 == 1 || rnd1 == 2 || rnd1 == 3 || rnd1 == 4 || rnd1 == 5 || rnd1 == 6 || rnd1 == 7) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd1 == 8 || rnd1 == 9 || rnd1 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd8 = rnd.nextInt(0, 11);
                                        if (rnd8 == 1 || rnd8 == 2 || rnd8 == 3 || rnd8 == 4 || rnd8 == 5 || rnd8 == 6 || rnd8 == 7) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd8 == 8 || rnd8 == 9 || rnd8 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                } else if (guc2 > guc1) {
                                    if (atak == true) {
                                        Random rnd = new Random();

                                        int rnd2 = rnd.nextInt(0, 11);
                                        if (rnd2 == 1 || rnd2 == 2 || rnd2 == 3 || rnd2 == 4) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd2 == 5 || rnd2 == 6 || rnd2 == 7 || rnd2 == 8 || rnd2 == 9 || rnd2 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd9 = rnd.nextInt(0, 11);
                                        if (rnd9 == 1 || rnd9 == 2 || rnd9 == 3 || rnd9 == 4) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            atak = true;
                                            sayac += macsayac;
                                        } else if (rnd9 == 5 || rnd9 == 6 || rnd9 == 7 || rnd9 == 8 || rnd9 == 9 || rnd9 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            atak = true;
                                            sayac += macsayac;
                                        }
                                    }
                                }
                            } else if (Math.abs(guc2 - guc1) <= 4) {
                                if (guc1 > guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd1 = rnd.nextInt(0, 11);
                                        if (rnd1 == 1 || rnd1 == 2 || rnd1 == 3 || rnd1 == 4 || rnd1 == 5 || rnd1 == 6) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd1 == 7 || rnd1 == 8 || rnd1 == 9 || rnd1 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd8 = rnd.nextInt(0, 11);
                                        if (rnd8 == 1 || rnd8 == 2 || rnd8 == 3 || rnd8 == 4 || rnd8 == 5 || rnd8 == 6) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd8 == 7 || rnd8 == 8 || rnd8 == 9 || rnd8 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                } else if (guc2 > guc1) {
                                    if (atak == true) {
                                        Random rnd = new Random();

                                        int rnd2 = rnd.nextInt(0, 12);
                                        if (rnd2 == 1 || rnd2 == 2 || rnd2 == 3 || rnd2 == 4 || rnd2 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd2 == 5 || rnd2 == 6 || rnd2 == 7 || rnd2 == 8 || rnd2 == 9 || rnd2 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd9 = rnd.nextInt(0, 12);
                                        if (rnd9 == 1 || rnd9 == 2 || rnd9 == 3 || rnd9 == 4 || rnd9 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;

                                        } else if (rnd9 == 5 || rnd9 == 6 || rnd9 == 7 || rnd9 == 8 || rnd9 == 9 || rnd9 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;

                                        }
                                    }
                                } else if (guc1 == guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd3 = rnd.nextInt(0, 12);
                                        if (rnd3 == 1 || rnd3 == 2 || rnd3 == 3 || rnd3 == 4 || rnd3 == 5 || rnd3 == 6) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd3 == 7 || rnd3 == 8 || rnd3 == 9 || rnd3 == 10 || rnd3 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd10 = rnd.nextInt(0, 11);
                                        if (rnd10 == 1 || rnd10 == 2 || rnd10 == 3 || rnd10 == 4 || rnd10 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd10 == 5 || rnd10 == 6 || rnd10 == 7 || rnd10 == 8 || rnd10 == 9 || rnd10 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                }
                            }
                        } else if (stad1 == stadsec2) {
                            if (Math.abs(guc2 - guc1) >= 5) {

                                if (guc2 > guc1) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd5 = rnd.nextInt(0, 11);
                                        if (rnd5 == 1 || rnd5 == 2 || rnd5 == 3) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd5 == 4 || rnd5 == 5 || rnd5 == 6 || rnd5 == 7 || rnd5 == 8 || rnd5 == 9 || rnd5 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd11 = rnd.nextInt(0, 11);
                                        if (rnd11 == 1 || rnd11 == 2 || rnd11 == 3 || rnd11 == 4 || rnd11 == 5 || rnd11 == 6 || rnd11 == 7) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd11 == 8 || rnd11 == 9 || rnd11 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    }
                                } else if (guc1 > guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd6 = rnd.nextInt(0, 11);
                                        if (rnd6 == 1 || rnd6 == 2 || rnd6 == 3 || rnd6 == 4 || rnd6 == 5 || rnd6 == 6) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd6 == 7 || rnd6 == 8 || rnd6 == 9 || rnd6 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd12 = rnd.nextInt(0, 11);
                                        if (rnd12 == 1 || rnd12 == 2 || rnd12 == 3 || rnd12 == 4 || rnd12 == 5 || rnd12 == 6) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd12 == 7 || rnd12 == 8 || rnd12 == 9 || rnd12 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                }
                            } else if (Math.abs(guc2 - guc1) <= 4) {
                                if (guc2 > guc1) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd5 = rnd.nextInt(0, 11);
                                        if (rnd5 == 1 || rnd5 == 2 || rnd5 == 3 || rnd5 == 4) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd5 == 5 || rnd5 == 6 || rnd5 == 7 || rnd5 == 8 || rnd5 == 9 || rnd5 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd11 = rnd.nextInt(0, 11);
                                        if (rnd11 == 1 || rnd11 == 2 || rnd11 == 3 || rnd11 == 4 || rnd11 == 5 || rnd11 == 6) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd11 == 7 || rnd11 == 8 || rnd11 == 9 || rnd11 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    }
                                } else if (guc1 > guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd6 = rnd.nextInt(0, 11);
                                        if (rnd6 == 1 || rnd6 == 2 || rnd6 == 3 || rnd6 == 4 || rnd6 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd6 == 6 || rnd6 == 7 || rnd6 == 8 || rnd6 == 9 || rnd6 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd12 = rnd.nextInt(0, 11);
                                        if (rnd12 == 1 || rnd12 == 2 || rnd12 == 3 || rnd12 == 4 || rnd12 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd12 == 6 || rnd12 == 7 || rnd12 == 8 || rnd12 == 9 || rnd12 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                } else if (guc1 == guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd7 = rnd.nextInt(0, 12);
                                        if (rnd7 == 1 || rnd7 == 2 || rnd7 == 3 || rnd7 == 4 || rnd7 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd7 == 5 || rnd7 == 6 || rnd7 == 7 || rnd7 == 8 || rnd7 == 9 || rnd7 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd13 = rnd.nextInt(0, 12);
                                        if (rnd13 == 1 || rnd13 == 2 || rnd13 == 3 || rnd13 == 4 || rnd13 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd13 == 5 || rnd13 == 6 || rnd13 == 7 || rnd13 == 8 || rnd13 == 9 || rnd13 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }

                                    }
                                }
                            }

                        } else {
                            if (Math.abs(guc2 - guc1) >= 5) {
                                if (guc2 > guc1) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd5 = rnd.nextInt(0, 12);
                                        if (rnd5 == 1 || rnd5 == 2 || rnd5 == 3 || rnd5 == 4 || rnd5 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd5 == 6 || rnd5 == 7 || rnd5 == 8 || rnd5 == 9 || rnd5 == 10 || rnd5 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd14 = rnd.nextInt(0, 12);
                                        if (rnd14 == 6 || rnd14 == 7 || rnd14 == 8 || rnd14 == 9 || rnd14 == 10 || rnd14 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd14 == 1 || rnd14 == 2 || rnd14 == 3 || rnd14 == 4 || rnd14 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                } else if (guc1 > guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd6 = rnd.nextInt(0, 12);
                                        if (rnd6 == 1 || rnd6 == 2 || rnd6 == 3 || rnd6 == 4 || rnd6 == 5 || rnd6 == 6) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd6 == 7 || rnd6 == 8 || rnd6 == 9 || rnd6 == 10 || rnd6 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd15 = rnd.nextInt(0, 12);
                                        if (rnd15 == 1 || rnd15 == 2 || rnd15 == 3 || rnd15 == 4 || rnd15 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd15 == 6 || rnd15 == 7 || rnd15 == 8 || rnd15 == 9 || rnd15 == 10 || rnd15 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                } else if (guc1 == guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd7 = rnd.nextInt(0, 11);
                                        if (rnd7 == 1 || rnd7 == 2 || rnd7 == 3 || rnd7 == 4 || rnd7 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd7 == 6 || rnd7 == 7 || rnd7 == 8 || rnd7 == 9 || rnd7 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd16 = rnd.nextInt(0, 11);
                                        if (rnd16 == 1 || rnd16 == 2 || rnd16 == 3 || rnd16 == 4 || rnd16 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd16 == 6 || rnd16 == 7 || rnd16 == 8 || rnd16 == 9 || rnd16 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }

                                }

                            } else if (Math.abs(guc2 - guc1) <= 4) {
                                if (guc2 > guc1) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd5 = rnd.nextInt(0, 14);
                                        if (rnd5 == 1 || rnd5 == 2 || rnd5 == 3 || rnd5 == 4 || rnd5 == 5 || rnd5 == 12) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd5 == 6 || rnd5 == 7 || rnd5 == 8 || rnd5 == 9 || rnd5 == 10 || rnd5 == 11 || rnd5 == 13) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd14 = rnd.nextInt(0, 14);
                                        if (rnd14 == 6 || rnd14 == 7 || rnd14 == 8 || rnd14 == 9 || rnd14 == 10 || rnd14 == 11 || rnd14 == 12) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd14 == 1 || rnd14 == 2 || rnd14 == 3 || rnd14 == 4 || rnd14 == 5 || rnd14 == 13) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                } else if (guc1 > guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd6 = rnd.nextInt(0, 14);
                                        if (rnd6 == 1 || rnd6 == 2 || rnd6 == 3 || rnd6 == 4 || rnd6 == 5 || rnd6 == 6 || rnd6 == 12) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd6 == 7 || rnd6 == 8 || rnd6 == 9 || rnd6 == 10 || rnd6 == 11 || rnd6 == 13) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd15 = rnd.nextInt(0, 14);
                                        if (rnd15 == 1 || rnd15 == 2 || rnd15 == 3 || rnd15 == 4 || rnd15 == 5 || rnd15 == 12) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd15 == 6 || rnd15 == 7 || rnd15 == 8 || rnd15 == 9 || rnd15 == 10 || rnd15 == 11 || rnd15 == 13) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                } else if (guc1 == guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd7 = rnd.nextInt(0, 11);
                                        if (rnd7 == 1 || rnd7 == 2 || rnd7 == 3 || rnd7 == 4 || rnd7 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd7 == 6 || rnd7 == 7 || rnd7 == 8 || rnd7 == 9 || rnd7 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd16 = rnd.nextInt(0, 11);
                                        if (rnd16 == 1 || rnd16 == 2 || rnd16 == 3 || rnd16 == 4 || rnd16 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd16 == 6 || rnd16 == 7 || rnd16 == 8 || rnd16 == 9 || rnd16 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }

                                }
                            }


                        }


                    }
                    //Skor Tablosuna Göre Spiker Yorumu
                    System.out.println("Evet Sayın Seyirciler İlk Yarı Sonucu : " + isim1 + ": " + gol1 + " " + isim2 + ": " + gol2);
                    if (Math.abs(gol1 - gol2) >= 3) {
                        if (gol1 > gol2) {
                            System.out.println(isim1 + " İlk Yarıyı Önde Bitiriyor.");
                            System.out.println(oyuncu1.ad1 + " Adlı Oyuncu Oyuncu Değişikliği Hakkı Kazandınız Kullanmak İstiyor Musunuz.(E/H)");
                            String a = scanner.next();
                            if (a.equals("E") || a.equals("e")) {
                                guc2 -= 1;
                                guc1 += 1;
                            } else if (a.equals("H") || a.equals("h")) {
                                guc1 = guc1;
                            }
                        }
                        else if (gol2 > gol1) {
                            System.out.println(isim2 + " İlk Yarıyı Önde Bitiriyor.");
                            System.out.println(oyuncu2.ad2 + " Oyuncu Değişikliği Hakkı Kazandınız Kullanmak İstiyor Musunuz.(E/H)");
                            String a = scanner.next();
                            if (a.equals("E") || a.equals("e")) {
                                guc1 -= 1;
                                guc2 += 1;
                            } else if (a.equals("H") || a.equals("h")) {
                                guc2 = guc2;
                            }
                        }
                        else if (gol1 == gol2) {
                            if (gol1 == 0 && gol2 == 0) {
                                System.out.println("İlk Yarıda İki Takımdanda Gol Sesi Çıkmadı.");
                            } else {
                                System.out.println("İlk Yarı Berabere Bitti İki Takımda Çok Çekişmeli Bir Oyun Sergiliyor.");
                            }
                            guc1 -= 1;
                            guc2 -= 1;
                        }
                    }
                    else if (Math.abs(gol1 - gol2) < 3) {
                        if (gol1 > gol2) {
                            System.out.println(isim1 + " İlk Yarıyı Önde Bitiriyor.");
                            System.out.println(oyuncu1.ad1 + " Adlı Oyuncu Oyuncu Değişikliği Hakkı Kazandınız Kullanmak İstiyor Musunuz.(+1 Güç)(E/H)");
                            String a = scanner.next();
                            if (a.equals("E") || a.equals("e")) {
                                guc1 += 1;
                            } else if (a.equals("H") || a.equals("h")) {
                                guc1 = guc1;
                            }
                        }
                        else if (gol2 > gol1) {
                            System.out.println(isim2 + " İlk Yarıyı Önde Bitiriyor.");
                            System.out.println(oyuncu2.ad2 + " Oyuncu Değişikliği Hakkı Kazandınız Kullanmak İstiyor Musunuz(+1 Güç).(E/H)");
                            String a = scanner.next();
                            if (a.equals("E") || a.equals("e")) {
                                guc2 += 1;
                            } else if (a.equals("H") || a.equals("h")) {
                                guc2 = guc2;
                            }
                        }
                        else if (gol1 == gol2) {
                            if (gol1 == 0 && gol2 == 0) {
                                System.out.println("İlk Yarıda İki Takımdanda Gol Sesi Çıkmadı.");
                            } else {
                                System.out.println("İlk Yarı Berabere Bitti İki Takımda Çok Çekişmeli Bir Oyun Sergiliyor.");
                            }
                            guc1 -= 1;
                            guc2 -= 1;
                        }
                    }
                    //İkinci Yarı Maç
                    while (sayac <= 90) {
                        Random ry=new Random();
                        int macsayac=ry.nextInt(6,16);
                        //  Gol Atma İstatistiklerinin Hesaplandığı Bölüm
                        if (stad1 == stadsec1) {
                            if (Math.abs(guc2 - guc1) >= 5) {

                                if (guc1 > guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd1 = rnd.nextInt(0, 11);
                                        if (rnd1 == 1 || rnd1 == 2 || rnd1 == 3 || rnd1 == 4 || rnd1 == 5 || rnd1 == 6 || rnd1 == 7) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd1 == 8 || rnd1 == 9 || rnd1 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd8 = rnd.nextInt(0, 11);
                                        if (rnd8 == 1 || rnd8 == 2 || rnd8 == 3 || rnd8 == 4 || rnd8 == 5 || rnd8 == 6 || rnd8 == 7) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd8 == 8 || rnd8 == 9 || rnd8 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                } else if (guc2 > guc1) {
                                    if (atak == true) {
                                        Random rnd = new Random();

                                        int rnd2 = rnd.nextInt(0, 11);
                                        if (rnd2 == 1 || rnd2 == 2 || rnd2 == 3 || rnd2 == 4) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd2 == 5 || rnd2 == 6 || rnd2 == 7 || rnd2 == 8 || rnd2 == 9 || rnd2 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd9 = rnd.nextInt(0, 11);
                                        if (rnd9 == 1 || rnd9 == 2 || rnd9 == 3 || rnd9 == 4) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            atak = true;
                                            sayac += macsayac;
                                        } else if (rnd9 == 5 || rnd9 == 6 || rnd9 == 7 || rnd9 == 8 || rnd9 == 9 || rnd9 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            atak = true;
                                            sayac += macsayac;
                                        }
                                    }
                                }
                            } else if (Math.abs(guc2 - guc1) <= 4) {
                                if (guc1 > guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd1 = rnd.nextInt(0, 11);
                                        if (rnd1 == 1 || rnd1 == 2 || rnd1 == 3 || rnd1 == 4 || rnd1 == 5 || rnd1 == 6) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd1 == 7 || rnd1 == 8 || rnd1 == 9 || rnd1 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd8 = rnd.nextInt(0, 11);
                                        if (rnd8 == 1 || rnd8 == 2 || rnd8 == 3 || rnd8 == 4 || rnd8 == 5 || rnd8 == 6) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd8 == 7 || rnd8 == 8 || rnd8 == 9 || rnd8 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                } else if (guc2 > guc1) {
                                    if (atak == true) {
                                        Random rnd = new Random();

                                        int rnd2 = rnd.nextInt(0, 12);
                                        if (rnd2 == 1 || rnd2 == 2 || rnd2 == 3 || rnd2 == 4 || rnd2 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd2 == 5 || rnd2 == 6 || rnd2 == 7 || rnd2 == 8 || rnd2 == 9 || rnd2 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd9 = rnd.nextInt(0, 12);
                                        if (rnd9 == 1 || rnd9 == 2 || rnd9 == 3 || rnd9 == 4 || rnd9 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;

                                        } else if (rnd9 == 5 || rnd9 == 6 || rnd9 == 7 || rnd9 == 8 || rnd9 == 9 || rnd9 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;

                                        }
                                    }
                                } else if (guc1 == guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd3 = rnd.nextInt(0, 12);
                                        if (rnd3 == 1 || rnd3 == 2 || rnd3 == 3 || rnd3 == 4 || rnd3 == 5 || rnd3 == 6) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd3 == 7 || rnd3 == 8 || rnd3 == 9 || rnd3 == 10 || rnd3 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd10 = rnd.nextInt(0, 11);
                                        if (rnd10 == 1 || rnd10 == 2 || rnd10 == 3 || rnd10 == 4 || rnd10 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd10 == 5 || rnd10 == 6 || rnd10 == 7 || rnd10 == 8 || rnd10 == 9 || rnd10 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                }
                            }
                        } else if (stad1 == stadsec2) {
                            if (Math.abs(guc2 - guc1) >= 5) {

                                if (guc2 > guc1) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd5 = rnd.nextInt(0, 11);
                                        if (rnd5 == 1 || rnd5 == 2 || rnd5 == 3) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd5 == 4 || rnd5 == 5 || rnd5 == 6 || rnd5 == 7 || rnd5 == 8 || rnd5 == 9 || rnd5 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd11 = rnd.nextInt(0, 11);
                                        if (rnd11 == 1 || rnd11 == 2 || rnd11 == 3 || rnd11 == 4 || rnd11 == 5 || rnd11 == 6 || rnd11 == 7) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd11 == 8 || rnd11 == 9 || rnd11 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    }
                                } else if (guc1 > guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd6 = rnd.nextInt(0, 11);
                                        if (rnd6 == 1 || rnd6 == 2 || rnd6 == 3 || rnd6 == 4 || rnd6 == 5 || rnd6 == 6) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd6 == 7 || rnd6 == 8 || rnd6 == 9 || rnd6 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd12 = rnd.nextInt(0, 11);
                                        if (rnd12 == 1 || rnd12 == 2 || rnd12 == 3 || rnd12 == 4 || rnd12 == 5 || rnd12 == 6) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd12 == 7 || rnd12 == 8 || rnd12 == 9 || rnd12 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                }
                            } else if (Math.abs(guc2 - guc1) <= 4) {
                                if (guc2 > guc1) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd5 = rnd.nextInt(0, 11);
                                        if (rnd5 == 1 || rnd5 == 2 || rnd5 == 3 || rnd5 == 4) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd5 == 5 || rnd5 == 6 || rnd5 == 7 || rnd5 == 8 || rnd5 == 9 || rnd5 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd11 = rnd.nextInt(0, 11);
                                        if (rnd11 == 1 || rnd11 == 2 || rnd11 == 3 || rnd11 == 4 || rnd11 == 5 || rnd11 == 6) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd11 == 7 || rnd11 == 8 || rnd11 == 9 || rnd11 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    }
                                } else if (guc1 > guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd6 = rnd.nextInt(0, 11);
                                        if (rnd6 == 1 || rnd6 == 2 || rnd6 == 3 || rnd6 == 4 || rnd6 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd6 == 6 || rnd6 == 7 || rnd6 == 8 || rnd6 == 9 || rnd6 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd12 = rnd.nextInt(0, 11);
                                        if (rnd12 == 1 || rnd12 == 2 || rnd12 == 3 || rnd12 == 4 || rnd12 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd12 == 6 || rnd12 == 7 || rnd12 == 8 || rnd12 == 9 || rnd12 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                } else if (guc1 == guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd7 = rnd.nextInt(0, 12);
                                        if (rnd7 == 1 || rnd7 == 2 || rnd7 == 3 || rnd7 == 4 || rnd7 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd7 == 5 || rnd7 == 6 || rnd7 == 7 || rnd7 == 8 || rnd7 == 9 || rnd7 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd13 = rnd.nextInt(0, 12);
                                        if (rnd13 == 1 || rnd13 == 2 || rnd13 == 3 || rnd13 == 4 || rnd13 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd13 == 5 || rnd13 == 6 || rnd13 == 7 || rnd13 == 8 || rnd13 == 9 || rnd13 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }

                                    }
                                }
                            }

                        } else {
                            if (Math.abs(guc2 - guc1) >= 5) {
                                if (guc2 > guc1) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd5 = rnd.nextInt(0, 12);
                                        if (rnd5 == 1 || rnd5 == 2 || rnd5 == 3 || rnd5 == 4 || rnd5 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd5 == 6 || rnd5 == 7 || rnd5 == 8 || rnd5 == 9 || rnd5 == 10 || rnd5 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd14 = rnd.nextInt(0, 12);
                                        if (rnd14 == 6 || rnd14 == 7 || rnd14 == 8 || rnd14 == 9 || rnd14 == 10 || rnd14 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd14 == 1 || rnd14 == 2 || rnd14 == 3 || rnd14 == 4 || rnd14 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                } else if (guc1 > guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd6 = rnd.nextInt(0, 12);
                                        if (rnd6 == 1 || rnd6 == 2 || rnd6 == 3 || rnd6 == 4 || rnd6 == 5 || rnd6 == 6) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd6 == 7 || rnd6 == 8 || rnd6 == 9 || rnd6 == 10 || rnd6 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd15 = rnd.nextInt(0, 12);
                                        if (rnd15 == 1 || rnd15 == 2 || rnd15 == 3 || rnd15 == 4 || rnd15 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd15 == 6 || rnd15 == 7 || rnd15 == 8 || rnd15 == 9 || rnd15 == 10 || rnd15 == 11) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                } else if (guc1 == guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd7 = rnd.nextInt(0, 11);
                                        if (rnd7 == 1 || rnd7 == 2 || rnd7 == 3 || rnd7 == 4 || rnd7 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd7 == 6 || rnd7 == 7 || rnd7 == 8 || rnd7 == 9 || rnd7 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd16 = rnd.nextInt(0, 11);
                                        if (rnd16 == 1 || rnd16 == 2 || rnd16 == 3 || rnd16 == 4 || rnd16 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd16 == 6 || rnd16 == 7 || rnd16 == 8 || rnd16 == 9 || rnd16 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }

                                }

                            } else if (Math.abs(guc2 - guc1) <= 4) {
                                if (guc2 > guc1) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd5 = rnd.nextInt(0, 14);
                                        if (rnd5 == 1 || rnd5 == 2 || rnd5 == 3 || rnd5 == 4 || rnd5 == 5 || rnd5 == 12) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd5 == 6 || rnd5 == 7 || rnd5 == 8 || rnd5 == 9 || rnd5 == 10 || rnd5 == 11 || rnd5 == 13) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd14 = rnd.nextInt(0, 14);
                                        if (rnd14 == 6 || rnd14 == 7 || rnd14 == 8 || rnd14 == 9 || rnd14 == 10 || rnd14 == 11 || rnd14 == 12) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd14 == 1 || rnd14 == 2 || rnd14 == 3 || rnd14 == 4 || rnd14 == 5 || rnd14 == 13) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                } else if (guc1 > guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd6 = rnd.nextInt(0, 14);
                                        if (rnd6 == 1 || rnd6 == 2 || rnd6 == 3 || rnd6 == 4 || rnd6 == 5 || rnd6 == 6 || rnd6 == 12) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd6 == 7 || rnd6 == 8 || rnd6 == 9 || rnd6 == 10 || rnd6 == 11 || rnd6 == 13) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd15 = rnd.nextInt(0, 14);
                                        if (rnd15 == 1 || rnd15 == 2 || rnd15 == 3 || rnd15 == 4 || rnd15 == 5 || rnd15 == 12) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd15 == 6 || rnd15 == 7 || rnd15 == 8 || rnd15 == 9 || rnd15 == 10 || rnd15 == 11 || rnd15 == 13) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }
                                } else if (guc1 == guc2) {
                                    if (atak == true) {
                                        Random rnd = new Random();
                                        int rnd7 = rnd.nextInt(0, 11);
                                        if (rnd7 == 1 || rnd7 == 2 || rnd7 == 3 || rnd7 == 4 || rnd7 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol1++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        } else if (rnd7 == 6 || rnd7 == 7 || rnd7 == 8 || rnd7 == 9 || rnd7 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim1 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = false;
                                        }
                                    } else if (atak == false) {
                                        Random rnd = new Random();
                                        int rnd16 = rnd.nextInt(0, 11);
                                        if (rnd16 == 1 || rnd16 == 2 || rnd16 == 3 || rnd16 == 4 || rnd16 == 5) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("GOOOOOOOOOOOOOOOL...");
                                            gol2++;
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        } else if (rnd16 == 6 || rnd16 == 7 || rnd16 == 8 || rnd16 == 9 || rnd16 == 10) {
                                            System.out.println("Dakika : " + sayac);
                                            System.out.println("Atağa " + isim2 + " Başlıyor");
                                            System.out.println("Rakip Kaleye Bir Şut....");
                                            System.out.println("Az Farkla Dışarı...");
                                            System.out.println("Durum : " + isim1 + ":" + gol1 + " " + isim2 + ":" + gol2);
                                            sayac += macsayac;
                                            atak = true;
                                        }
                                    }

                                }
                            }


                        }


                    }
                    System.out.println("Maç Sonucu :" + isim1 + ": " + gol1 + " " + isim2 + ": " + gol2);
                    if (gol1 > gol2) {
                        System.out.println("Maçı " + oyuncu1.ad1 + " Kazandı......");
                    }
                    else if (gol2 > gol1) {
                        System.out.println("Maçı " + oyuncu2.ad2 + " Kazandı......");
                    }
                    else if (gol1 == gol2) {
                        System.out.println("Berabere Bitii......");
                    }
                }
                else if (yesno.equals("H") || yesno.equals("h")) {
                    System.out.println("Hoşçakalın...");
                }
                else {
                    System.out.println("Yanlış Değer Girdiniz Lütfen Doğru Bir Değer Giriniz!!!");
                    continue gir5;
                }
                break;
            }


        }

        }
    }




