// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/service.proto

package com.google.cloud.automl.v1beta1;

public interface ImportDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ImportDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Dataset name. Dataset must already exist. All imported
   * annotations and examples will be added.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Dataset name. Dataset must already exist. All imported
   * annotations and examples will be added.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The desired input location.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 3;</code>
   */
  boolean hasInputConfig();
  /**
   * <pre>
   * Required. The desired input location.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 3;</code>
   */
  com.google.cloud.automl.v1beta1.InputConfig getInputConfig();
  /**
   * <pre>
   * Required. The desired input location.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 3;</code>
   */
  com.google.cloud.automl.v1beta1.InputConfigOrBuilder getInputConfigOrBuilder();
}
