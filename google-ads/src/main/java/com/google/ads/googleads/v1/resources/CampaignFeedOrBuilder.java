// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/campaign_feed.proto

package com.google.ads.googleads.v1.resources;

public interface CampaignFeedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.CampaignFeed)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the campaign feed.
   * Campaign feed resource names have the form:
   * `customers/{customer_id}/campaignFeeds/{campaign_id}~{feed_id}
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the campaign feed.
   * Campaign feed resource names have the form:
   * `customers/{customer_id}/campaignFeeds/{campaign_id}~{feed_id}
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The feed to which the CampaignFeed belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue feed = 2;</code>
   */
  boolean hasFeed();
  /**
   * <pre>
   * The feed to which the CampaignFeed belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue feed = 2;</code>
   */
  com.google.protobuf.StringValue getFeed();
  /**
   * <pre>
   * The feed to which the CampaignFeed belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue feed = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFeedOrBuilder();

  /**
   * <pre>
   * The campaign to which the CampaignFeed belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 3;</code>
   */
  boolean hasCampaign();
  /**
   * <pre>
   * The campaign to which the CampaignFeed belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 3;</code>
   */
  com.google.protobuf.StringValue getCampaign();
  /**
   * <pre>
   * The campaign to which the CampaignFeed belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCampaignOrBuilder();

  /**
   * <pre>
   * Indicates which placeholder types the feed may populate under the connected
   * campaign. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.enums.PlaceholderTypeEnum.PlaceholderType placeholder_types = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v1.enums.PlaceholderTypeEnum.PlaceholderType> getPlaceholderTypesList();
  /**
   * <pre>
   * Indicates which placeholder types the feed may populate under the connected
   * campaign. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.enums.PlaceholderTypeEnum.PlaceholderType placeholder_types = 4;</code>
   */
  int getPlaceholderTypesCount();
  /**
   * <pre>
   * Indicates which placeholder types the feed may populate under the connected
   * campaign. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.enums.PlaceholderTypeEnum.PlaceholderType placeholder_types = 4;</code>
   */
  com.google.ads.googleads.v1.enums.PlaceholderTypeEnum.PlaceholderType getPlaceholderTypes(int index);
  /**
   * <pre>
   * Indicates which placeholder types the feed may populate under the connected
   * campaign. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.enums.PlaceholderTypeEnum.PlaceholderType placeholder_types = 4;</code>
   */
  java.util.List<java.lang.Integer>
  getPlaceholderTypesValueList();
  /**
   * <pre>
   * Indicates which placeholder types the feed may populate under the connected
   * campaign. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.enums.PlaceholderTypeEnum.PlaceholderType placeholder_types = 4;</code>
   */
  int getPlaceholderTypesValue(int index);

  /**
   * <pre>
   * Matching function associated with the CampaignFeed.
   * The matching function is used to filter the set of feed items selected.
   * Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.MatchingFunction matching_function = 5;</code>
   */
  boolean hasMatchingFunction();
  /**
   * <pre>
   * Matching function associated with the CampaignFeed.
   * The matching function is used to filter the set of feed items selected.
   * Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.MatchingFunction matching_function = 5;</code>
   */
  com.google.ads.googleads.v1.common.MatchingFunction getMatchingFunction();
  /**
   * <pre>
   * Matching function associated with the CampaignFeed.
   * The matching function is used to filter the set of feed items selected.
   * Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.MatchingFunction matching_function = 5;</code>
   */
  com.google.ads.googleads.v1.common.MatchingFunctionOrBuilder getMatchingFunctionOrBuilder();

  /**
   * <pre>
   * Status of the campaign feed.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.FeedLinkStatusEnum.FeedLinkStatus status = 6;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * Status of the campaign feed.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.FeedLinkStatusEnum.FeedLinkStatus status = 6;</code>
   */
  com.google.ads.googleads.v1.enums.FeedLinkStatusEnum.FeedLinkStatus getStatus();
}
