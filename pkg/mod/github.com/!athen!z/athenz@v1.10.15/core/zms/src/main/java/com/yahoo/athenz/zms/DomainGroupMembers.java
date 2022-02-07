//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import com.yahoo.rdl.*;

//
// DomainGroupMembers -
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class DomainGroupMembers {
    public String domainName;
    public List<DomainGroupMember> members;

    public DomainGroupMembers setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return domainName;
    }
    public DomainGroupMembers setMembers(List<DomainGroupMember> members) {
        this.members = members;
        return this;
    }
    public List<DomainGroupMember> getMembers() {
        return members;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != DomainGroupMembers.class) {
                return false;
            }
            DomainGroupMembers a = (DomainGroupMembers) another;
            if (domainName == null ? a.domainName != null : !domainName.equals(a.domainName)) {
                return false;
            }
            if (members == null ? a.members != null : !members.equals(a.members)) {
                return false;
            }
        }
        return true;
    }
}
