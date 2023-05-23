package net.minecraft.launcher.process;

public interface JavaProcessListener {
  void onJavaProcessLog(JavaProcess paramJavaProcess, String paramString);
  
  void onJavaProcessEnded(JavaProcess paramJavaProcess);
  
  void onJavaProcessError(JavaProcess paramJavaProcess, Throwable paramThrowable);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/net/minecraft/launcher/process/JavaProcessListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */