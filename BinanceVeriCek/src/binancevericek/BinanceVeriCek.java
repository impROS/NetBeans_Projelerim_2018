/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binancevericek;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinanceVeriCek extends TimerTask {

    public static ArrayList<String> arrBTCUSDT;

    public static void main(String[] args) {
        try {
            arrBTCUSDT = new ArrayList<>();
            binanceCoinCek();
        } catch (InterruptedException ex) {
            Logger.getLogger(BinanceVeriCek.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void binanceCoinCek()
            throws InterruptedException {
        TimerTask repeatedTask = new TimerTask() {
            public void run() {
                String strBTCUSDT = new BinanceVeriCek().urlOku("https://api.binance.com/api/v1/ticker/price?symbol=EOSUSDT");
                Coin btcusdt = new Gson().fromJson(strBTCUSDT, Coin.class);

                // System.out.println(btcusdt.getSymbol());
                System.out.println(btcusdt.getPrice());
            }
        };
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        long delay = 1000L;
        long period = 5000L;//
        executor.scheduleAtFixedRate(repeatedTask, delay, period, TimeUnit.MILLISECONDS);
        Thread.sleep(delay + period * 50000);
        executor.shutdown();
    }

    public void binanceCoinCek2() {
        TimerTask repeatedTask = new TimerTask() {
            @Override
            public void run() {
                String strBTCUSDT = new BinanceVeriCek().urlOku("https://api.binance.com/api/v1/ticker/price?symbol=XRPUSDT");
                Coin btcusdt = new Gson().fromJson(strBTCUSDT, Coin.class);

                // System.out.println(btcusdt.getSymbol());
                System.out.println(btcusdt.getPrice());
                completeTask();
            }
        };
        Timer timer = new Timer("Timer");

        long delay = 1000L;
        long period = 1000L;
        timer.scheduleAtFixedRate(repeatedTask, delay, period);
    }

    public static String urlOku(String strUrl) {
        String strRawData = "", inputLine = "";
        try {

            URL oracle = new URL(strUrl);
            HttpURLConnection httpcon = (HttpURLConnection) oracle.openConnection();
            httpcon.addRequestProperty("User-Agent", "Mozilla/4.0");

            BufferedReader in = new BufferedReader(new InputStreamReader(httpcon.getInputStream()));
            while ((inputLine = in.readLine()) != null) {
                strRawData += inputLine;
            }
            in.close();
        } catch (Exception ex) {

        }

        return strRawData;
    }

    @Override
    public void run() {

        String strBTCUSDT = new BinanceVeriCek().urlOku("https://api.binance.com/api/v1/ticker/price?symbol=XRPUSDT");
        Coin btcusdt = new Gson().fromJson(strBTCUSDT, Coin.class);

        // System.out.println(btcusdt.getSymbol());
        System.out.println(btcusdt.getPrice());
        completeTask();
    }

    private void completeTask() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
