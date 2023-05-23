/*    */ package org.apache.commons.io.serialization;
/*    */ 
/*    */ import org.apache.commons.io.FilenameUtils;
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
/*    */ final class WildcardClassNameMatcher
/*    */   implements ClassNameMatcher
/*    */ {
/*    */   private final String pattern;
/*    */   
/*    */   public WildcardClassNameMatcher(String pattern) {
/* 40 */     this.pattern = pattern;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean matches(String className) {
/* 45 */     return FilenameUtils.wildcardMatch(className, this.pattern);
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/commons/io/serialization/WildcardClassNameMatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */