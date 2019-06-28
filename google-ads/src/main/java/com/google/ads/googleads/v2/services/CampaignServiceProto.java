// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/campaign_service.proto

package com.google.ads.googleads.v2.services;

public final class CampaignServiceProto {
  private CampaignServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_GetCampaignRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_GetCampaignRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_CampaignOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_CampaignOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v2/services/campa" +
      "ign_service.proto\022 google.ads.googleads." +
      "v2.services\0320google/ads/googleads/v2/res" +
      "ources/campaign.proto\032\034google/api/annota" +
      "tions.proto\032 google/protobuf/field_mask." +
      "proto\032\027google/rpc/status.proto\032\027google/a" +
      "pi/client.proto\"+\n\022GetCampaignRequest\022\025\n" +
      "\rresource_name\030\001 \001(\t\"\246\001\n\026MutateCampaigns" +
      "Request\022\023\n\013customer_id\030\001 \001(\t\022G\n\noperatio" +
      "ns\030\002 \003(\01323.google.ads.googleads.v2.servi" +
      "ces.CampaignOperation\022\027\n\017partial_failure" +
      "\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\341\001\n\021Campai" +
      "gnOperation\022/\n\013update_mask\030\004 \001(\0132\032.googl" +
      "e.protobuf.FieldMask\022=\n\006create\030\001 \001(\0132+.g" +
      "oogle.ads.googleads.v2.resources.Campaig" +
      "nH\000\022=\n\006update\030\002 \001(\0132+.google.ads.googlea" +
      "ds.v2.resources.CampaignH\000\022\020\n\006remove\030\003 \001" +
      "(\tH\000B\013\n\toperation\"\225\001\n\027MutateCampaignsRes" +
      "ponse\0221\n\025partial_failure_error\030\003 \001(\0132\022.g" +
      "oogle.rpc.Status\022G\n\007results\030\002 \003(\01326.goog" +
      "le.ads.googleads.v2.services.MutateCampa" +
      "ignResult\"-\n\024MutateCampaignResult\022\025\n\rres" +
      "ource_name\030\001 \001(\t2\232\003\n\017CampaignService\022\245\001\n" +
      "\013GetCampaign\0224.google.ads.googleads.v2.s" +
      "ervices.GetCampaignRequest\032+.google.ads." +
      "googleads.v2.resources.Campaign\"3\202\323\344\223\002-\022" +
      "+/v2/{resource_name=customers/*/campaign" +
      "s/*}\022\301\001\n\017MutateCampaigns\0228.google.ads.go" +
      "ogleads.v2.services.MutateCampaignsReque" +
      "st\0329.google.ads.googleads.v2.services.Mu" +
      "tateCampaignsResponse\"9\202\323\344\223\0023\"./v2/custo" +
      "mers/{customer_id=*}/campaigns:mutate:\001*" +
      "\032\033\312A\030googleads.googleapis.comB\373\001\n$com.go" +
      "ogle.ads.googleads.v2.servicesB\024Campaign" +
      "ServiceProtoP\001ZHgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v2/services;" +
      "services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V2" +
      ".Services\312\002 Google\\Ads\\GoogleAds\\V2\\Serv" +
      "ices\352\002$Google::Ads::GoogleAds::V2::Servi" +
      "cesb\006proto3"
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
          com.google.ads.googleads.v2.resources.CampaignProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_services_GetCampaignRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_GetCampaignRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_GetCampaignRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_services_MutateCampaignsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v2_services_CampaignOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v2_services_CampaignOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_CampaignOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v2_services_MutateCampaignsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v2_services_MutateCampaignResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.resources.CampaignProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}