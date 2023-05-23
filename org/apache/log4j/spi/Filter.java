/*     */ package org.apache.log4j.spi;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class Filter
/*     */   implements OptionHandler
/*     */ {
/*     */   public Filter next;
/*     */   public static final int DENY = -1;
/*     */   public static final int NEUTRAL = 0;
/*     */   public static final int ACCEPT = 1;
/*     */   
/*     */   public void activateOptions() {}
/*     */   
/*     */   public abstract int decide(LoggingEvent paramLoggingEvent);
/*     */   
/*     */   public void setNext(Filter next) {
/* 114 */     this.next = next;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Filter getNext() {
/* 121 */     return this.next;
/*     */   }
/*     */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/log4j/spi/Filter.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */