package fr.northborders.trendingrepos.data.model

import com.google.gson.annotations.SerializedName

data class UserEntity(
    @SerializedName(LOGIN) val login: String,
    @SerializedName(ID) val id: Int,
    @SerializedName(AVATAR_URL) val avatarUrl: String,
    @SerializedName(GRAVATAR_ID) val gravatarId: String,
    @SerializedName(URL) val url: String,
    @SerializedName(HTML_URL) val htmlUrl: String,
    @SerializedName(FOLLOWERS_URL) val followersUrl: String,
    @SerializedName(FOLLOWERING_URL) val followeringUrl: String,
    @SerializedName(GISTS_URL) val gistsUrl: String,
    @SerializedName(STATTED_URL) val stattedUrl: String,
    @SerializedName(SUBSCRIPTIONS_URL) val subscriptionsUrl: String,
    @SerializedName(ORGANIZATIONS_URL) val organizationsUrl: String,
    @SerializedName(REPOS_URL) val reposUrl: String,
    @SerializedName(EVENTS_URL) val eventsUrl: String,
    @SerializedName(RECEIVED_EVENTS_URL) val receivedEventsUrl: String,
    @SerializedName(TYPE) val type: String,
    @SerializedName(SITE_ADMIN) val siteAdmin: Boolean,
    @SerializedName(SCORE) val score: Int,
    @SerializedName(EMAIL) val email: String,
    @SerializedName(NAME) val starGazersCount: String,
    @SerializedName(COMPANY) val company: String,
    @SerializedName(BLOG) val blog: String,
    @SerializedName(LOCATION) val location: String,
    @SerializedName(CREATED_AT) val createdAt: String,
    @SerializedName(UPDATED_AT) val updatedAt: String,
    @SerializedName(FOLLOWERS) val forks: Int,
    @SerializedName(FOLLOWING) val openIssues: Int
) {
    companion object {
        private const val LOGIN = "login"
        private const val ID = "id"
        private const val AVATAR_URL = "avatar_url"
        private const val GRAVATAR_ID = "gravatar_id"
        private const val URL = "url"
        private const val HTML_URL = "html_url"
        private const val FOLLOWERS_URL = "followers_url"
        private const val FOLLOWERING_URL = "followering_url"
        private const val GISTS_URL = "gists_url"
        private const val STATTED_URL = "statted_url"
        private const val SUBSCRIPTIONS_URL = "subscriptions_url"
        private const val ORGANIZATIONS_URL = "organizations_url"
        private const val REPOS_URL = "repos_url"
        private const val EVENTS_URL = "events_url"
        private const val RECEIVED_EVENTS_URL = "received_events_url"
        private const val TYPE = "type"
        private const val SITE_ADMIN = "site_admin"
        private const val SCORE = "score"
        private const val EMAIL = "email"
        private const val NAME = "name"
        private const val COMPANY = "company"
        private const val BLOG = "blog"
        private const val LOCATION = "location"
        private const val CREATED_AT = "created_at"
        private const val UPDATED_AT = "updated_at"
        private const val FOLLOWERS = "followers"
        private const val FOLLOWING = "following"
    }
}

