package Comparator;

import java.util.Comparator;

class SortByname implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}


