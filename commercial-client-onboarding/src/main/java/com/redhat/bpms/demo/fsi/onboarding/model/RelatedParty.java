package com.redhat.bpms.demo.fsi.onboarding.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "RelatedParty")
public class RelatedParty implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "RELATEDPARTY_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "RELATEDPARTY_ID_SEQ", name = "RELATEDPARTY_ID_GENERATOR")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("Relationship")
   private java.lang.String relationship;

   @javax.persistence.ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   @org.kie.api.definition.type.Label("Party")
   private com.redhat.bpms.demo.fsi.onboarding.model.Party party;

   public RelatedParty()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getRelationship()
   {
      return this.relationship;
   }

   public void setRelationship(java.lang.String relationship)
   {
      this.relationship = relationship;
   }

   public com.redhat.bpms.demo.fsi.onboarding.model.Party getParty()
   {
      return this.party;
   }

   public void setParty(com.redhat.bpms.demo.fsi.onboarding.model.Party party)
   {
      this.party = party;
   }

   public RelatedParty(java.lang.Long id, java.lang.String relationship,
         com.redhat.bpms.demo.fsi.onboarding.model.Party party)
   {
      this.id = id;
      this.relationship = relationship;
      this.party = party;
   }

}