package com.bilgeadam.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloPostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello PostServlet");

        String adi=req.getParameter("adi");
        String soyadi=req.getParameter("soyadi");
        String kullaniciAdi=req.getParameter("kullaniciAdi");
        String sifre=req.getParameter("sifre");

        System.out.println("Adı: "+adi+" Soyadı: "+soyadi+" Kullanıcı Adı: "+kullaniciAdi+" Sifre: "+ sifre);

    }
}
