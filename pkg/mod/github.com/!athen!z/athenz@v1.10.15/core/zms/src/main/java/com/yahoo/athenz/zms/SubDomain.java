//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import java.util.Map;
import com.yahoo.rdl.*;

//
// SubDomain - A Subdomain is a TopLevelDomain, except it has a parent.
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubDomain {
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String description;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String org;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean enabled;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean auditEnabled;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String account;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer ypmId;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String applicationId;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String certDnsDomain;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer memberExpiryDays;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer tokenExpiryMins;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer serviceCertExpiryMins;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer roleCertExpiryMins;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String signAlgorithm;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer serviceExpiryDays;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer groupExpiryDays;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String userAuthorityFilter;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String azureSubscription;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, StringList> tags;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String businessService;
    public String name;
    public List<String> adminUsers;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public DomainTemplateList templates;
    public String parent;

    public SubDomain setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return description;
    }
    public SubDomain setOrg(String org) {
        this.org = org;
        return this;
    }
    public String getOrg() {
        return org;
    }
    public SubDomain setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return enabled;
    }
    public SubDomain setAuditEnabled(Boolean auditEnabled) {
        this.auditEnabled = auditEnabled;
        return this;
    }
    public Boolean getAuditEnabled() {
        return auditEnabled;
    }
    public SubDomain setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return account;
    }
    public SubDomain setYpmId(Integer ypmId) {
        this.ypmId = ypmId;
        return this;
    }
    public Integer getYpmId() {
        return ypmId;
    }
    public SubDomain setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return applicationId;
    }
    public SubDomain setCertDnsDomain(String certDnsDomain) {
        this.certDnsDomain = certDnsDomain;
        return this;
    }
    public String getCertDnsDomain() {
        return certDnsDomain;
    }
    public SubDomain setMemberExpiryDays(Integer memberExpiryDays) {
        this.memberExpiryDays = memberExpiryDays;
        return this;
    }
    public Integer getMemberExpiryDays() {
        return memberExpiryDays;
    }
    public SubDomain setTokenExpiryMins(Integer tokenExpiryMins) {
        this.tokenExpiryMins = tokenExpiryMins;
        return this;
    }
    public Integer getTokenExpiryMins() {
        return tokenExpiryMins;
    }
    public SubDomain setServiceCertExpiryMins(Integer serviceCertExpiryMins) {
        this.serviceCertExpiryMins = serviceCertExpiryMins;
        return this;
    }
    public Integer getServiceCertExpiryMins() {
        return serviceCertExpiryMins;
    }
    public SubDomain setRoleCertExpiryMins(Integer roleCertExpiryMins) {
        this.roleCertExpiryMins = roleCertExpiryMins;
        return this;
    }
    public Integer getRoleCertExpiryMins() {
        return roleCertExpiryMins;
    }
    public SubDomain setSignAlgorithm(String signAlgorithm) {
        this.signAlgorithm = signAlgorithm;
        return this;
    }
    public String getSignAlgorithm() {
        return signAlgorithm;
    }
    public SubDomain setServiceExpiryDays(Integer serviceExpiryDays) {
        this.serviceExpiryDays = serviceExpiryDays;
        return this;
    }
    public Integer getServiceExpiryDays() {
        return serviceExpiryDays;
    }
    public SubDomain setGroupExpiryDays(Integer groupExpiryDays) {
        this.groupExpiryDays = groupExpiryDays;
        return this;
    }
    public Integer getGroupExpiryDays() {
        return groupExpiryDays;
    }
    public SubDomain setUserAuthorityFilter(String userAuthorityFilter) {
        this.userAuthorityFilter = userAuthorityFilter;
        return this;
    }
    public String getUserAuthorityFilter() {
        return userAuthorityFilter;
    }
    public SubDomain setAzureSubscription(String azureSubscription) {
        this.azureSubscription = azureSubscription;
        return this;
    }
    public String getAzureSubscription() {
        return azureSubscription;
    }
    public SubDomain setTags(Map<String, StringList> tags) {
        this.tags = tags;
        return this;
    }
    public Map<String, StringList> getTags() {
        return tags;
    }
    public SubDomain setBusinessService(String businessService) {
        this.businessService = businessService;
        return this;
    }
    public String getBusinessService() {
        return businessService;
    }
    public SubDomain setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return name;
    }
    public SubDomain setAdminUsers(List<String> adminUsers) {
        this.adminUsers = adminUsers;
        return this;
    }
    public List<String> getAdminUsers() {
        return adminUsers;
    }
    public SubDomain setTemplates(DomainTemplateList templates) {
        this.templates = templates;
        return this;
    }
    public DomainTemplateList getTemplates() {
        return templates;
    }
    public SubDomain setParent(String parent) {
        this.parent = parent;
        return this;
    }
    public String getParent() {
        return parent;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != SubDomain.class) {
                return false;
            }
            SubDomain a = (SubDomain) another;
            if (description == null ? a.description != null : !description.equals(a.description)) {
                return false;
            }
            if (org == null ? a.org != null : !org.equals(a.org)) {
                return false;
            }
            if (enabled == null ? a.enabled != null : !enabled.equals(a.enabled)) {
                return false;
            }
            if (auditEnabled == null ? a.auditEnabled != null : !auditEnabled.equals(a.auditEnabled)) {
                return false;
            }
            if (account == null ? a.account != null : !account.equals(a.account)) {
                return false;
            }
            if (ypmId == null ? a.ypmId != null : !ypmId.equals(a.ypmId)) {
                return false;
            }
            if (applicationId == null ? a.applicationId != null : !applicationId.equals(a.applicationId)) {
                return false;
            }
            if (certDnsDomain == null ? a.certDnsDomain != null : !certDnsDomain.equals(a.certDnsDomain)) {
                return false;
            }
            if (memberExpiryDays == null ? a.memberExpiryDays != null : !memberExpiryDays.equals(a.memberExpiryDays)) {
                return false;
            }
            if (tokenExpiryMins == null ? a.tokenExpiryMins != null : !tokenExpiryMins.equals(a.tokenExpiryMins)) {
                return false;
            }
            if (serviceCertExpiryMins == null ? a.serviceCertExpiryMins != null : !serviceCertExpiryMins.equals(a.serviceCertExpiryMins)) {
                return false;
            }
            if (roleCertExpiryMins == null ? a.roleCertExpiryMins != null : !roleCertExpiryMins.equals(a.roleCertExpiryMins)) {
                return false;
            }
            if (signAlgorithm == null ? a.signAlgorithm != null : !signAlgorithm.equals(a.signAlgorithm)) {
                return false;
            }
            if (serviceExpiryDays == null ? a.serviceExpiryDays != null : !serviceExpiryDays.equals(a.serviceExpiryDays)) {
                return false;
            }
            if (groupExpiryDays == null ? a.groupExpiryDays != null : !groupExpiryDays.equals(a.groupExpiryDays)) {
                return false;
            }
            if (userAuthorityFilter == null ? a.userAuthorityFilter != null : !userAuthorityFilter.equals(a.userAuthorityFilter)) {
                return false;
            }
            if (azureSubscription == null ? a.azureSubscription != null : !azureSubscription.equals(a.azureSubscription)) {
                return false;
            }
            if (tags == null ? a.tags != null : !tags.equals(a.tags)) {
                return false;
            }
            if (businessService == null ? a.businessService != null : !businessService.equals(a.businessService)) {
                return false;
            }
            if (name == null ? a.name != null : !name.equals(a.name)) {
                return false;
            }
            if (adminUsers == null ? a.adminUsers != null : !adminUsers.equals(a.adminUsers)) {
                return false;
            }
            if (templates == null ? a.templates != null : !templates.equals(a.templates)) {
                return false;
            }
            if (parent == null ? a.parent != null : !parent.equals(a.parent)) {
                return false;
            }
        }
        return true;
    }
}
