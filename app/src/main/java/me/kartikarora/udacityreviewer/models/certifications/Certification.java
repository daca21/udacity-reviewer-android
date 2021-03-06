package me.kartikarora.udacityreviewer.models.certifications;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Developer: chipset
 * Package : me.kartikarora.udacityreviewer.models.certifications
 * Project : UdacityReviewer
 * Date : 2/6/17
 */

public class Certification {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("project_id")
    @Expose
    private Integer projectId;
    @SerializedName("grader_id")
    @Expose
    private Integer graderId;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("waitlisted_at")
    @Expose
    private Object waitlistedAt;
    @SerializedName("certified_at")
    @Expose
    private String certifiedAt;
    @SerializedName("trainings_count")
    @Expose
    private Integer trainingsCount;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("allowed_to_audit")
    @Expose
    private Boolean allowedToAudit;
    @SerializedName("project")
    @Expose
    private Project project;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getGraderId() {
        return graderId;
    }

    public void setGraderId(Integer graderId) {
        this.graderId = graderId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getWaitlistedAt() {
        return waitlistedAt;
    }

    public void setWaitlistedAt(Object waitlistedAt) {
        this.waitlistedAt = waitlistedAt;
    }

    public String getCertifiedAt() {
        return certifiedAt;
    }

    public void setCertifiedAt(String certifiedAt) {
        this.certifiedAt = certifiedAt;
    }

    public Integer getTrainingsCount() {
        return trainingsCount;
    }

    public void setTrainingsCount(Integer trainingsCount) {
        this.trainingsCount = trainingsCount;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getAllowedToAudit() {
        return allowedToAudit;
    }

    public void setAllowedToAudit(Boolean allowedToAudit) {
        this.allowedToAudit = allowedToAudit;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(id, this.project.getId());
    }
}