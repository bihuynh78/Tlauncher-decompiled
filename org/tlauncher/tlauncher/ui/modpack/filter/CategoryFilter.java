/*    */ package org.tlauncher.tlauncher.ui.modpack.filter;
/*    */ 
/*    */ import org.tlauncher.modpack.domain.client.GameEntityDTO;
/*    */ import org.tlauncher.modpack.domain.client.share.Category;
/*    */ 
/*    */ public class CategoryFilter implements GameEntityFilter {
/*    */   private Category category;
/*    */   
/*    */   public CategoryFilter(Category category) {
/* 10 */     this.category = category;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isProper(GameEntityDTO gameEntity) {
/* 19 */     return true;
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/ui/modpack/filter/CategoryFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */