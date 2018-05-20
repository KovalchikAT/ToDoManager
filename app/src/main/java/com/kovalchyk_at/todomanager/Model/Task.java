package com.kovalchyk_at.todomanager.Model;

import java.util.Date;
import java.util.List;

/**
 * Created by Kovalchyk_AT on 22.03.2018.
 */

public class Task {
    private String taskId;
// дати для роботи з завданням
    private Date dateCreate; // створення задачі
    private Date dateCorrection; // останнього коригування
    private Date dateRealizationPlan; // планова встановлена менеджером
    private Date dateRealizationActual; // фактичного виконання
// іd замовника, менеджера та робітника
    private Integer customerId;
    private Integer managerId;
    private Integer workerId;

    private List<Integer> subtaskId; // список підзавдань для розподілу задачі між робітниками
    private String taskName;
    private String taskDescription; // детальний опис завдання
    private String taskType; // тип завдання
//примітки виконання
    private String customerNote;
    private String managerNote;
    private String workerNote;
//прапори для позначення виконаної задачі/підзадачі
    private String customerNoteFlag;
    private String managerNoteFlag;
    private String workerNoteFlag;

    private Date customerNoteTime;
    private Date managerNoteTime;
    private Date workerNoteTime;

    public Task() {
    }

    public Task(String taskId,
                Date dateCreate,
                Date dateCorrection,
                Date dateRealizationPlan,
                Date dateRealizationActual,
                Integer customerId,
                Integer managerId,
                Integer workerId,
                List<Integer> subtaskId,
                String taskName,
                String taskDescription,
                String taskType,
                String customerNote,
                String managerNote,
                String workerNote,
                String customerNoteFlag,
                String managerNoteFlag,
                String workerNoteFlag,
                Date customerNoteTime,
                Date managerNoteTime,
                Date workerNoteTime) {
        this.taskId = taskId;
        this.dateCreate = dateCreate;
        this.dateCorrection = dateCorrection;
        this.dateRealizationPlan = dateRealizationPlan;
        this.dateRealizationActual = dateRealizationActual;
        this.customerId = customerId;
        this.managerId = managerId;
        this.workerId = workerId;
        this.subtaskId = subtaskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskType = taskType;
        this.customerNote = customerNote;
        this.managerNote = managerNote;
        this.workerNote = workerNote;
        this.customerNoteFlag = customerNoteFlag;
        this.managerNoteFlag = managerNoteFlag;
        this.workerNoteFlag = workerNoteFlag;
        this.customerNoteTime = customerNoteTime;
        this.managerNoteTime = managerNoteTime;
        this.workerNoteTime = workerNoteTime;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateCorrection() {
        return dateCorrection;
    }

    public void setDateCorrection(Date dateCorrection) {
        this.dateCorrection = dateCorrection;
    }

    public Date getDateRealizationPlan() {
        return dateRealizationPlan;
    }

    public void setDateRealizationPlan(Date dateRealizationPlan) {
        this.dateRealizationPlan = dateRealizationPlan;
    }

    public Date getDateRealizationActual() {
        return dateRealizationActual;
    }

    public void setDateRealizationActual(Date dateRealizationActual) {
        this.dateRealizationActual = dateRealizationActual;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public List<Integer> getSubtaskId() {
        return subtaskId;
    }

    public void setSubtaskId(List<Integer> subtaskId) {
        this.subtaskId = subtaskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getCustomerNote() {
        return customerNote;
    }

    public void setCustomerNote(String customerNote) {
        this.customerNote = customerNote;
    }

    public String getManagerNote() {
        return managerNote;
    }

    public void setManagerNote(String managerNote) {
        this.managerNote = managerNote;
    }

    public String getWorkerNote() {
        return workerNote;
    }

    public void setWorkerNote(String workerNote) {
        this.workerNote = workerNote;
    }

    public String getCustomerNoteFlag() {
        return customerNoteFlag;
    }

    public void setCustomerNoteFlag(String customerNoteFlag) {
        this.customerNoteFlag = customerNoteFlag;
    }

    public String getManagerNoteFlag() {
        return managerNoteFlag;
    }

    public void setManagerNoteFlag(String managerNoteFlag) {
        this.managerNoteFlag = managerNoteFlag;
    }

    public String getWorkerNoteFlag() {
        return workerNoteFlag;
    }

    public void setWorkerNoteFlag(String workerNoteFlag) {
        this.workerNoteFlag = workerNoteFlag;
    }

    public Date getCustomerNoteTime() {
        return customerNoteTime;
    }

    public void setCustomerNoteTime(Date customerNoteTime) {
        this.customerNoteTime = customerNoteTime;
    }

    public Date getManagerNoteTime() {
        return managerNoteTime;
    }

    public void setManagerNoteTime(Date managerNoteTime) {
        this.managerNoteTime = managerNoteTime;
    }

    public Date getWorkerNoteTime() {
        return workerNoteTime;
    }

    public void setWorkerNoteTime(Date workerNoteTime) {
        this.workerNoteTime = workerNoteTime;
    }
}
