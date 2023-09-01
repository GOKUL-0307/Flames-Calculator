/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Random;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
/**
 *
 * @author admin
 */
public class Flames extends HttpServlet {

   
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            //action perform in do get
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
             Connection con=null;
             Statement stmt=null;
            //accept the value of html text
            String s1=request.getParameter("FNAME");
            String s2=request.getParameter("SNAME");
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/user","root","gokul");
            stmt=con.createStatement();
            stmt.executeUpdate("insert into flames values('"+s1+"','"+s2+"')");
          // out.print("<h1> Account Created Successfully</h1>");
            
        }
        catch(Exception e){
            out.println("sorry!!! Try again later.");
        }
            s1=s1.toUpperCase();
            s2=s2.toUpperCase();
            s1=s1.replaceAll(" ","");//use to remove spaces
            s2=s2.replaceAll(" ","");//use to remove spaces
            StringBuffer sb1=new StringBuffer(s1);
            StringBuffer sb2=new StringBuffer(s2);
            Random random=new Random();
            for(int i=0;i<sb1.length();i++){
                for(int j=0;j<sb2.length();j++){
                    if(sb1.charAt(i)==sb2.charAt(j)){
                        sb1=sb1.deleteCharAt(i);
                        sb2=sb2.deleteCharAt(j);
                        i=0;
                        j=-1;
                    }
                }
            }
            int t=sb1.length()+sb2.length();
            int t1=t-1;
            String f="flames";
            for(int k=6;k>1;k--){
                int l=t1%k;
                if(l==0){
                    f=f.substring(l+1);
                }
                else{
                    f=f.substring(l+1)+f.substring(0,l);
                }
            }
            char c=f.charAt(0);
            
             out.println("<br>");
             out.println("<head>");
             out.println("<br>");
            // out.println("<style> body{ background-image: url('l2.jpg');background-size: 100% 100%;}</style>");
             out.println("</head>");
            out.println("<body bgcolor=Mediumspringgreen style=display:flex; align-items:center; justify-content:center;flex-direction:column;>");
            out.println("<div>");
           out.println("<h2 align=center style=color:HoneyDew>𝓨𝓞𝓤𝓡 𝓕𝓛𝓐𝓜𝓔𝓢 𝓒𝓗𝓞𝓘𝓒𝓔 𝓘𝓢 !! !!</h2>");
            out.println("<br>");
            switch(c){
                case 'f':
                    out.print("<h2 align=center style=color:blue;>FRIEND</h2>");
                    out.println("<br>");
                     out.println("<style> body{ background-image: url('f.jpg');background-size: 100% 100%;}</style>");
                    out.print("<h3 align=center>✳🌠🎀 🍁🍁 𝓕?𝓲𝓮𝓷𝓭𝓼𝓱𝓲𝓹 𝓲𝓼 𝓽𝓱𝓮 𝓱𝓪𝓻𝓭𝓮𝓼𝓽 𝓽𝓱𝓲?𝓰 𝓲𝓷 𝓽𝓱𝓮 𝔀𝓸𝓻𝓵𝓭 𝓽𝓸 𝓮𝔁𝓹𝓵𝓪𝓲𝓷. 𝓘𝓽’𝓼 𝓷𝓸𝓽 𝓼𝓸𝓶𝓮𝓽𝓱𝓲𝓷𝓰 𝔂𝓸𝓾 𝓵𝓮𝓪𝓻𝓷 𝓲𝓷 𝓼𝓬𝓱𝓸𝓸𝓵. 𝓑𝓾𝓽 𝓲𝓯 𝔂𝓸𝓾 𝓱𝓪𝓿𝓮𝓷’𝓽 𝓵𝓮𝓪𝓻𝓷𝓮𝓭 𝓽𝓱𝓮 𝓶𝓮𝓪𝓷𝓲𝓷𝓰 𝓸𝓯 𝓯𝓻𝓲𝓮𝓷𝓭𝓼𝓱𝓲𝓹, 𝔂𝓸𝓾 𝓻𝓮𝓪𝓵𝓵𝔂 𝓱𝓪𝓿𝓮𝓷’𝓽 𝓵𝓮𝓪𝓻𝓷𝓮𝓭 𝓪𝓷𝔂𝓽𝓱𝓲𝓷𝓰 🍁🍁 🌠✳🎀</h3>");
                    break;
                case 'l':
                    out.print("<h2 align=center style=color:LightGoldenRodYellow;>LOVE</h2>");
                    out.print("<br>");
                     out.println("<style> body{ background-image: url('l.jpg');background-size: 100% 100%;}</style>");
                    out.print("<h3 align=center style=color:MintCream>💍💖🌼🌼 𝒫𝑒𝑜𝓅𝓁𝑒 𝓉𝒽𝒾𝓃𝓀 𝒶 𝓈𝑜𝓊𝓁 𝓂𝒶𝓉𝑒 𝒾𝓈 𝓎𝑜𝓊𝓇 𝓅𝑒𝓇𝒻𝑒𝒸𝓉 𝒻𝒾𝓉, 𝒶𝓃𝒹 𝓉𝒽𝒶𝓉’𝓈 𝓌𝒽𝒶𝓉 𝑒𝓋𝑒𝓇𝓎𝑜𝓃𝑒 𝓌𝒶𝓃𝓉𝓈. 𝐵𝓊𝓉 𝒶 𝓉𝓇𝓊𝑒 𝓈𝑜𝓊𝓁 𝓂𝒶𝓉𝑒 𝒾𝓈 𝒶 𝓂𝒾𝓇𝓇𝑜𝓇, 𝓉𝒽𝑒 𝓅𝑒𝓇𝓈𝑜𝓃 𝓌𝒽𝑜 𝓈𝒽𝑜𝓌𝓈 𝓎𝑜𝓊 𝑒𝓋𝑒𝓇𝓎𝓉𝒽𝒾𝓃𝑔 𝓉𝒽𝒶𝓉 𝒾𝓈 𝒽𝑜𝓁𝒹𝒾𝓃𝑔 𝓎𝑜𝓊 𝒷𝒶𝒸𝓀, 𝓉𝒽𝑒 𝓅𝑒𝓇𝓈𝑜𝓃 𝓌𝒽𝑜 𝒷𝓇𝒾𝓃𝑔𝓈 𝓎𝑜𝓊 𝓉𝑜 𝓎𝑜𝓊𝓇 𝑜𝓌𝓃 𝒶𝓉𝓉𝑒𝓃𝓉𝒾𝑜𝓃 𝓈𝑜 𝓎𝑜𝓊 𝒸𝒶𝓃 𝒸𝒽𝒶𝓃𝑔𝑒 𝓎𝑜𝓊𝓇 𝓁𝒾𝒻𝑒. 🌼🌼💍💖</h3>");
                    break;
                case 'a':
                    out.print("<h2 align=center style=color:blue;>AFFECTION</h2>");
                    out.print("<br>");
                    out.println("<style> body{ background-image: url('a.jpg');background-size: 100% 100%;}</style>");
                    out.print("<h3 align=center>✧❈😂🐯  🌸ꗥ～ꗥ🌸 𝐈𝐧 𝐚𝐥𝐥 𝐭𝐡𝐞 𝐰𝐨𝐫𝐥𝐝, 𝐭𝐡𝐞𝐫𝐞 𝐢𝐬 𝐧𝐨 𝐡𝐞𝐚𝐫𝐭 𝐟𝐨𝐫 𝐦𝐞 𝐥𝐢𝐤𝐞 𝐲𝐨𝐮𝐫𝐬. 𝐈𝐧 𝐚𝐥𝐥 𝐭𝐡𝐞 𝐰𝐨𝐫𝐥𝐝, 𝐭𝐡𝐞𝐫𝐞 𝐢𝐬 𝐧𝐨 𝐥𝐨𝐯𝐞 𝐟𝐨𝐫 𝐲𝐨𝐮 𝐥𝐢𝐤𝐞 𝐦𝐢𝐧𝐞 🌸ꗥ～ꗥ🌸  🐲🐳 ❈✧</h3>");
                    break;
                case 'm':
                    out.print("<h2 align=center style=color:blue;>MARRIAGE</h2>");
                     out.print("<br>");
                     out.print("<br>");
                     out.print("<br>");
                      out.println("<style> body{ background-image: url('m.jpg');background-size: 100% 100%;}</style>");
                    out.print("<h3 align=center style=color:Aqua>✶🌟⭐ When you realize you want to spend the rest of your life with somebody, you want the rest of your life to begin as soon as possible. ⭐🌟✶ </h3>");
                    break;
                case 'e':
                    out.print("<h2 align=center style=color:blue;>ENEMY</h2>");
                    out.print("<br>");
                     out.println("<style> body{ background-image: url('e.jpg');background-size: 100% 100%;}</style>");
                    out.print("<h3 align=center style=color:SeaShell> ☃️It is easy enough to be friendly to one's friends. But to befriend the one who regards himself as your enemy is the quintessence of true religion. The other is mere business. ☃️</h3>");
                    break;
                case 's':
                    out.print("<h2 align=center style=color:blue;>SIBLING</h2>");
                    out.print("<br>");
                     out.println("<style> body{ background-image: url('s1.jpg');background-size: 100% 100%;}</style>");
                    out.print("<h3 align=center>🍁🍁 𝓨𝓸𝓾 𝓭𝓸𝓷’𝓽 𝓬𝓱𝓸𝓸𝓼𝓮 𝔂𝓸𝓾𝓻 𝓯𝓪𝓶𝓲𝓵𝔂. 𝓣𝓱𝓮𝔂 𝓪𝓻𝓮 𝓖𝓸𝓭’𝓼 𝓰𝓲𝓯𝓽 𝓽𝓸 𝔂𝓸𝓾, 𝓪𝓼 𝔂𝓸𝓾 𝓪𝓻𝓮 𝓽𝓸 𝓽𝓱𝓮𝓶 🍁🍁</h3>");
                    break;
            }
            out.println("</div>");
            out.print("</body>");
        
              
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
