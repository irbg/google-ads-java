// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/hotel_group_view.proto

package com.google.ads.googleads.v3.resources;

public final class HotelGroupViewProto {
  private HotelGroupViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_HotelGroupView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_HotelGroupView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v3/resources/hote" +
      "l_group_view.proto\022!google.ads.googleads" +
      ".v3.resources\032\031google/api/resource.proto" +
      "\032\034google/api/annotations.proto\"\216\001\n\016Hotel" +
      "GroupView\022\025\n\rresource_name\030\001 \001(\t:e\352Ab\n\'g" +
      "oogleads.googleapis.com/HotelGroupView\0227" +
      "customers/{customer}/hotelGroupViews/{ho" +
      "tel_group_view}B\200\002\n%com.google.ads.googl" +
      "eads.v3.resourcesB\023HotelGroupViewProtoP\001" +
      "ZJgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v3/resources;resources\242\002\003G" +
      "AA\252\002!Google.Ads.GoogleAds.V3.Resources\312\002" +
      "!Google\\Ads\\GoogleAds\\V3\\Resources\352\002%Goo" +
      "gle::Ads::GoogleAds::V3::Resourcesb\006prot" +
      "o3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_HotelGroupView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_HotelGroupView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_HotelGroupView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}