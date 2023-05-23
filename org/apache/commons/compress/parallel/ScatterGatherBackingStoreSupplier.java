package org.apache.commons.compress.parallel;

import java.io.IOException;

public interface ScatterGatherBackingStoreSupplier {
  ScatterGatherBackingStore get() throws IOException;
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/commons/compress/parallel/ScatterGatherBackingStoreSupplier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */