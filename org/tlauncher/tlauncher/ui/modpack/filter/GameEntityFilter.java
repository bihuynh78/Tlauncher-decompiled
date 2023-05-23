package org.tlauncher.tlauncher.ui.modpack.filter;

import org.tlauncher.modpack.domain.client.GameEntityDTO;

public interface GameEntityFilter extends Filter<GameEntityDTO> {
  boolean isProper(GameEntityDTO paramGameEntityDTO);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/ui/modpack/filter/GameEntityFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */