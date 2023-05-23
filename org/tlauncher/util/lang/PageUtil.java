/*    */ package org.tlauncher.util.lang;
/*    */ 
/*    */ import org.tlauncher.tlauncher.rmo.TLauncher;
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
/*    */ public class PageUtil
/*    */ {
/*    */   public static String buildPagePath() {
/* 18 */     TLauncher.getInstance(); return TLauncher.getInstance().getPagePrefix() + TLauncher.getInnerSettings()
/* 19 */       .get(TLauncher.getInstance().getConfiguration().getLocale().getLanguage());
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/util/lang/PageUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */