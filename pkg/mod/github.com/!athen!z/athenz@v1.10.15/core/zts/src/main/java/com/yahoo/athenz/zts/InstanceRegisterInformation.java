//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zts;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import com.yahoo.rdl.*;

//
// InstanceRegisterInformation -
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstanceRegisterInformation {
    public String provider;
    public String domain;
    public String service;
    public String attestationData;
    public String csr;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String ssh;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean token;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer expiryTime;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String hostname;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> hostCnames;

    public InstanceRegisterInformation setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return provider;
    }
    public InstanceRegisterInformation setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return domain;
    }
    public InstanceRegisterInformation setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return service;
    }
    public InstanceRegisterInformation setAttestationData(String attestationData) {
        this.attestationData = attestationData;
        return this;
    }
    public String getAttestationData() {
        return attestationData;
    }
    public InstanceRegisterInformation setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return csr;
    }
    public InstanceRegisterInformation setSsh(String ssh) {
        this.ssh = ssh;
        return this;
    }
    public String getSsh() {
        return ssh;
    }
    public InstanceRegisterInformation setToken(Boolean token) {
        this.token = token;
        return this;
    }
    public Boolean getToken() {
        return token;
    }
    public InstanceRegisterInformation setExpiryTime(Integer expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }
    public Integer getExpiryTime() {
        return expiryTime;
    }
    public InstanceRegisterInformation setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return hostname;
    }
    public InstanceRegisterInformation setHostCnames(List<String> hostCnames) {
        this.hostCnames = hostCnames;
        return this;
    }
    public List<String> getHostCnames() {
        return hostCnames;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != InstanceRegisterInformation.class) {
                return false;
            }
            InstanceRegisterInformation a = (InstanceRegisterInformation) another;
            if (provider == null ? a.provider != null : !provider.equals(a.provider)) {
                return false;
            }
            if (domain == null ? a.domain != null : !domain.equals(a.domain)) {
                return false;
            }
            if (service == null ? a.service != null : !service.equals(a.service)) {
                return false;
            }
            if (attestationData == null ? a.attestationData != null : !attestationData.equals(a.attestationData)) {
                return false;
            }
            if (csr == null ? a.csr != null : !csr.equals(a.csr)) {
                return false;
            }
            if (ssh == null ? a.ssh != null : !ssh.equals(a.ssh)) {
                return false;
            }
            if (token == null ? a.token != null : !token.equals(a.token)) {
                return false;
            }
            if (expiryTime == null ? a.expiryTime != null : !expiryTime.equals(a.expiryTime)) {
                return false;
            }
            if (hostname == null ? a.hostname != null : !hostname.equals(a.hostname)) {
                return false;
            }
            if (hostCnames == null ? a.hostCnames != null : !hostCnames.equals(a.hostCnames)) {
                return false;
            }
        }
        return true;
    }
}
