<?php

class referansParaHesapla
{

    public static function tree($id, $isKobi)
    {
        if ($isKobi == 0) {
            $maxDerinlik = 11; //ilk derinilk 25 şartından sonra değişti önceden $maxDerinilk = 6 idi.
        } else if ($isKobi == 1) {
            $maxDerinlik = 11;
        }

        $output = null;
        $bireyselDerinlikSayac = array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        $kobiDerinlikSayac = array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        function tree(&$output = null, $parent = -1, $indent = null, $maxDerinlik, $isKobi, &$toplam, &$kobiDerinlikSayac, &$bireyselDerinlikSayac)
        {

            // if (strlen($indent) >= $maxDerinlik) {
            //   return $output;
            //  }

            $db = new PDO("mysql:host=localhost;dbname=rmzgrupc_arabul", 'rmzgrupc_arabulu', 'Aa24002400__');

            $r = $db->prepare("SELECT * FROM uyeler WHERE referansID=:parentid");
            $r->execute(array(
                'parentid' => $parent,

            ));

            while ($c = $r->fetch(PDO::FETCH_ASSOC)) {
                $output .= $indent . $c['adi'];

                if ($c['ID'] != $parent) {
                    if ($c['isKobi'] == 0) {
                        $bireyselDerinlikSayac[strlen($indent)] += 1;
                    } else if ($c['isKobi'] == 1) {
                        $kobiDerinlikSayac[strlen($indent)] += 1;
                    }

                    //  print_r($bireyselDerinlikSayac);

                    if ($c['yatirilanTutar'] > 0) {

                        if ($c['isKobi'] == 0) {
                            if (strlen($indent) < 2) {
                                $toplam += 50;
                            } else {
                                $toplam += 10;
                            }
                            //echo $toplam . "///";
                        } else if ($c['isKobi'] == 1) {
                            if (strlen($indent) < 2) {
                                $toplam += 100;
                            } else {
                                $toplam += 10;
                            }
                        }

                    }
                    // echo "" . $toplam . "\n";
                    tree($output, $c['ID'], $indent . "-", $maxDerinlik, $isKobi, $toplam, $kobiDerinlikSayac, $bireyselDerinlikSayac);
                }

            }

            return $output;
        }
        //  echo "tree once";
        tree($output, $id, "-", $maxDerinlik, $isKobi, $toplam, $kobiDerinlikSayac, $bireyselDerinlikSayac);
        //  echo "tree sonra";

        ///******DERİNLİK HESAPLAMA******
        $genelToplam =0;

        //******BIREYSEL KAZANC HESAPLAMA */
        
        $bireyselDerinlikSayac = array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        $kobiDerinlikSayac = array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);


        $arrBireyselKosul = array(10,15, 20, 25);
        $arrKobiKosul = array(10, 13, 15, 17, 19, 21, 23, 24, 25);

        $toplamBireysel =$bireyselDerinlikSayac[0] *5;
        for($i=1;$i<5;$i++){
            if($bireyselDerinlikSayac[i-1] < $arrBireyselKosul[i-1]){
                echo ($i+1).".Derinlik False ==> ".$bireyselDerinlikSayac[$i-1];
                break;
            }
            echo ($i+1).".Derinlik True ==>"+$bireyselDerinlikSayac[i-1];
            $toplamBireysel +=$bireyselDerinlikSayac[i];
        }
        
        $bireyselKazanc =$toplamBireysel*10;
        echo "Bireysel : "+$toplamBireysel." * "+"10 = ".$bireyselKazanc;
        /****END BIREYSEL DERINLIK KAZANC */

 ///******end DERİNLİK HESAPLAMA******
        $genelToplam+=$bireyselKazanc;
        echo "\nGenel Toplam : " . $genelToplam."\n";

        return $genelToplam;


        
        /*  if ($isKobi == 0) {

        if ($isKobi == 0 && $kobiDerinlikSayac[1] > 25) {
        $toplam = $toplam;
        } else if ($isKobi == 0 && $kobiDerinlikSayac[1] < 25) {
        if ($bireyselDerinlikSayac[1] <= 10) {
        $toplam = $toplam - ($bireyselDerinlikSayac[2] * 10);
        }
        if ($bireyselDerinlikSayac[2] < 15) {
        $toplam = $toplam - ($bireyselDerinlikSayac[3] * 10);
        }
        if ($bireyselDerinlikSayac[3] < 20) {
        $toplam = $toplam - ($bireyselDerinlikSayac[4] * 10);
        }
        if ($bireyselDerinlikSayac[4] < 25) {
        $toplam = $toplam - ($bireyselDerinlikSayac[5] * 10);
        }

        if ($kobiDerinlikSayac[1] <= 10) {
        $toplam = $toplam - ($kobiDerinlikSayac[2] * 10);
        }
        if ($kobiDerinlikSayac[2] < 15) {
        $toplam = $toplam - ($kobiDerinlikSayac[3] * 10);
        }
        if ($kobiDerinlikSayac[3] < 20) {
        $toplam = $toplam - ($kobiDerinlikSayac[4] * 10);
        }
        if ($kobiDerinlikSayac[4] < 25) {
        $toplam = $toplam - ($kobiDerinlikSayac[5] * 10);
        }

        }

        }

        if ($isKobi == 1) {

        if ($kobiDerinlikSayac[1] < 10) {
        $toplam = $toplam - ($kobiDerinlikSayac[2] * 10);
        }
        if ($kobiDerinlikSayac[2] < 13) {
        $toplam = $toplam - ($kobiDerinlikSayac[3] * 10);
        }
        if ($kobiDerinlikSayac[3] < 15) {
        $toplam = $toplam - ($kobiDerinlikSayac[4] * 10);
        }
        if ($kobiDerinlikSayac[4] < 17) {
        $toplam = $toplam - ($kobiDerinlikSayac[5] * 10);
        }
        if ($kobiDerinlikSayac[5] < 19) {
        $toplam = $toplam - ($kobiDerinlikSayac[6] * 10);
        }
        if ($kobiDerinlikSayac[6] < 21) {
        $toplam = $toplam - ($kobiDerinlikSayac[7] * 10);
        }
        if ($kobiDerinlikSayac[7] < 23) {
        $toplam = $toplam - ($kobiDerinlikSayac[8] * 10);
        }
        if ($kobiDerinlikSayac[8] < 24) {
        $toplam = $toplam - ($kobiDerinlikSayac[9] * 10);
        }
        if ($kobiDerinlikSayac[9] < 25) {
        $toplam = $toplam - ($kobiDerinlikSayac[10] * 10);
        }

        if ($bireyselDerinlikSayac[1] < 10) {
        $toplam = $toplam - ($bireyselDerinlikSayac[2] * 10);
        //echo $bireyselDerinlikSayac[2];
        echo "----" . $toplam;
        }
        if ($bireyselDerinlikSayac[2] < 13) {
        $toplam = $toplam - ($bireyselDerinlikSayac[3] * 10);
        }
        if ($bireyselDerinlikSayac[3] < 15) {
        $toplam = $toplam - ($bireyselDerinlikSayac[4] * 10);
        }
        if ($bireyselDerinlikSayac[4] < 17) {
        $toplam = $toplam - ($bireyselDerinlikSayac[5] * 10);
        }
        if ($bireyselDerinlikSayac[5] < 19) {
        $toplam = $toplam - ($bireyselDerinlikSayac[6] * 10);
        }
        if ($bireyselDerinlikSayac[6] < 21) {
        $toplam = $toplam - ($bireyselDerinlikSayac[7] * 10);
        }
        if ($bireyselDerinlikSayac[7] < 23) {
        $toplam = $toplam - ($bireyselDerinlikSayac[8] * 10);
        }
        if ($bireyselDerinlikSayac[8] < 24) {
        $toplam = $toplam - ($bireyselDerinlikSayac[9] * 10);
        }
        if ($bireyselDerinlikSayac[9] < 25) {
        $toplam = $toplam - ($bireyselDerinlikSayac[10] * 10);
        }
        }*/

        //echo "\n" . $toplam;
        return $toplam;
    }

}
