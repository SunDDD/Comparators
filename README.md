# Comparators
测试比较器

运行Test.java

1. 使用自建的插入排序算法根据name进行排序
```
Student{name='Chen', section=3}
Student{name='Furia', section=1}
Student{name='Gazsi', section=4}
Student{name='Kanaga', section=3}
Student{name='Rohde', section=2}
```
2. 根据section进行排序
```
Student{name='Furia', section=1}
Student{name='Rohde', section=2}
Student{name='Chen', section=3}
Student{name='Kanaga', section=3}
Student{name='Gazsi', section=4}
```

3. 自建的比较器可以用于系统排序算法
```
Arrays.sort(students, Student.BY_SECTION);
```
