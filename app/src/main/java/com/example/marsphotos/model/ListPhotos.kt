package com.example.marsphotos.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

typealias Root = List<ListPhotos>;
@Serializable
data class ListPhotos(
    val id: String,
    val slug: String,
    @SerialName("alternative_slugs")
    val alternativeSlugs: AlternativeSlugs,
    @SerialName
("created_at")
    val createdAt: String,
    @SerialName
("updated_at")
    val updatedAt: String,
    @SerialName
("promoted_at")
    val promotedAt: String,
    val width: Long,
    val height: Long,
    val color: String,
    @SerialName
("blur_hash")
    val blurHash: String,
    val description: String?,
    @SerialName
("alt_description")
    val altDescription: String,
    val urls: Urls,
    val likes: Long,
    @SerialName
("liked_by_user")
    val likedByUser: Boolean,

    @SerialName
("asset_type")
    val assetType: String,
)
@Serializable
data class AlternativeSlugs(
    val en: String,
    val es: String,
    val ja: String,
    val fr: String,
    val it: String,
    val ko: String,
    val de: String,
    val pt: String,
)



data class Links(
    val self: String,
    val html: String,
    val download: String,
    @SerialName
("download_location")
    val downloadLocation: String,
)

data class TopicSubmissions(
    val wallpapers: Wallpapers?,
    val travel: Travel?,
    @SerialName
("street-photography")
    val streetPhotography: StreetPhotography?,
    val people: People?,
)

data class Wallpapers(
    val status: String,
)

data class Travel(
    val status: String,
)

data class StreetPhotography(
    val status: String,
    @SerialName
("approved_on")
    val approvedOn: String,
)

data class People(
    val status: String,
)

data class User(
    val id: String,
    @SerialName
("updated_at")
    val updatedAt: String,
    val username: String,
    val name: String,
    @SerialName
("first_name")
    val firstName: String,
    @SerialName
("last_name")
    val lastName: String?,
    @SerialName
("twitter_username")
    val twitterUsername: String?,
    @SerialName
("portfolio_url")
    val portfolioUrl: String?,
    val bio: String?,
    val location: String?,
    val links: Links2,
    @SerialName
("profile_image")
    val profileImage: ProfileImage,
    @SerialName
("instagram_username")
    val instagramUsername: String?,
    @SerialName
("total_collections")
    val totalCollections: Long,
    @SerialName
("total_likes")
    val totalLikes: Long,
    @SerialName
("total_photos")
    val totalPhotos: Long,
    @SerialName
("total_promoted_photos")
    val totalPromotedPhotos: Long,
    @SerialName
("total_illustrations")
    val totalIllustrations: Long,
    @SerialName
("total_promoted_illustrations")
    val totalPromotedIllustrations: Long,
    @SerialName
("accepted_tos")
    val acceptedTos: Boolean,
    @SerialName
("for_hire")
    val forHire: Boolean,
    val social: Social,
)

data class Links2(
    val self: String,
    val html: String,
    val photos: String,
    val likes: String,
    val portfolio: String,
    val following: String,
    val followers: String,
)

data class ProfileImage(
    val small: String,
    val medium: String,
    val large: String,
)

data class Social(
    @SerialName
("instagram_username")
    val instagramUsername: String?,
    @SerialName
("portfolio_url")
    val portfolioUrl: String?,
    @SerialName
("twitter_username")
    val twitterUsername: String?,
    @SerialName
("paypal_email")
    val paypalEmail: Any?,
)
