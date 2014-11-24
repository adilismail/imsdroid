/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public enum tsip_stack_mode_t {
  tsip_stack_mode_ua,
  tsip_stack_mode_p2p,
  tsip_stack_mode_mediaproxy,
  tsip_stack_mode_mcu;

  public final int swigValue() {
    return swigValue;
  }

  public static tsip_stack_mode_t swigToEnum(int swigValue) {
    tsip_stack_mode_t[] swigValues = tsip_stack_mode_t.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (tsip_stack_mode_t swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + tsip_stack_mode_t.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private tsip_stack_mode_t() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private tsip_stack_mode_t(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private tsip_stack_mode_t(tsip_stack_mode_t swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

