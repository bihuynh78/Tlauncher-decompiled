/*    */ package org.apache.log4j.varia;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.net.URL;
/*    */ import org.apache.log4j.PropertyConfigurator;
/*    */ import org.apache.log4j.spi.Configurator;
/*    */ import org.apache.log4j.spi.LoggerRepository;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ReloadingPropertyConfigurator
/*    */   implements Configurator
/*    */ {
/* 29 */   PropertyConfigurator delegate = new PropertyConfigurator();
/*    */   
/*    */   public void doConfigure(InputStream inputStream, LoggerRepository repository) {}
/*    */   
/*    */   public void doConfigure(URL url, LoggerRepository repository) {}
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/log4j/varia/ReloadingPropertyConfigurator.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */