package com.kovalchyk_at.todomaneger.Model;

import java.util.Date;
import java.util.List;

/**
 * Created by Kovalchyk_AT on 22.03.2018.
 */

public class Task {
    private int id;
// дати для роботи з завданням
    private Date dateKreate; // створення задачі
    private Date dateCorrection; // останнього коригування
    private Date dateRealization; // реалізації запропонована замовником/начальником
    private Date dateRealizationPlan; // планова встановлена менеджером
    private Date dateRealizationActual; // фактичного виконання
// іd замовника, менеджера та робітника
    private int customerId;
    private int managerId;
    private int workerId;

    private List<Task> subtasks; // список підзавдань для розподілу задачі між робітниками
    private String taskDescription; // детальний опис завдання
    private String taskType; // тип завдання
//примітки виконання
    private String customerNote;
    private String managerNote;
    private String workerNote;
//прапори для позначення виконаної задачі/підзадачі
    private Boolean customerNoteBool;
    private Boolean managerNoteBool;
    private Boolean workerNoteBool;

}
