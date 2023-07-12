package com.christianbutnot.moremetals.utils;

import net.minecraft.world.level.block.state.BlockState;

public interface BreakCheck {

    boolean canBreak(BlockState state);
}