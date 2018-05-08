package com.kovalchyk_at.todomanager.Model;

import java.util.Date;
import java.util.List;

/**
 * Created by Kovalchyk_AT on 22.03.2018.
 */

public class Task {
    private Integer taskId;
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

    public Task(Integer taskId, Date dateCreate, Date dateCorrection, Date dateRealizationPlan, Date dateRealizationActual, Integer customerId, Integer managerId, Integer workerId, List<Integer> subtaskId, String taskName, String taskDescription, String taskType, String customerNote, String managerNote, String workerNote, String customerNoteFlag, String managerNoteFlag, String workerNoteFlag, Date customerNoteTime, Date managerNoteTime, Date workerNoteTime) {
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
}
