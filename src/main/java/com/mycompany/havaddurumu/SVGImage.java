/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.havaddurumu;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JLabel;

/**
 *
 * @author Alpay
 */
public class SVGImage extends JLabel{
    
    private FlatSVGIcon svgIcon;
    
    public void setSvgImage(String url){
        try{
            URL imageUrl = new URL(url);
            
            svgIcon = new FlatSVGIcon(imageUrl);
            setIcon(svgIcon);
        }catch(MalformedURLException ex){
            System.out.println("URL Yanlış");
        }
    }
}
