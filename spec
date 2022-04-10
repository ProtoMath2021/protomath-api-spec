// lesson
{
  id: "",
  plannedDateTime: "2022-01-01T12:00",
  student: {
    Id: ""
    Name: "Petrov",
    Level: ""
  },
  teacher: {
      Id: ""
      Name: "Ivanova",
    },
  status: "",
  subject: "",
  "type": "ENUM {SIMPLE ,HOME_TASK, TEST, EXAM_SIMULATION, WRITING_TASK}",
  subtopics: []
}



// student
{

}

// topic - тема
{
    title: "",
    subtopics: [],
    level: "",
    suject: "algebra",
}

// subtopic - подтема
{
    title: "",
    author: "", ///TODO
    card: []
}

// card
{
    title: "",
    payload: ""
}




 ////////////////
lessonStatus:
planned
canceled
finished
missed
/////////////////


//////////////TODO
GET
teachers/{tId}/statistics
//////////////

// учитель уроки
POST
teachers/{tid}/lessons
{}

GET
teachers/{tid}/lessons
teachers/{tid}/lessons/{lid}
teachers/{tid}/subjects


PATCH
teachers/{tid}/lessons/{lid}
{
  plannedDateTime: "2022-01-01T12:00",
  status: "",
  subTopics: []
}

// учитель статы


// поиск
POST
/lessons/search
{
  name:
  passed:
  studentId:
  status:
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////
Students:

POST
teachers/{tId}/students
{
}

GET
teachers/{tId}/students
{
 studentInfo
}


GET
students/{sId}
{
      student
}


POST
students/
{
      student
}

POST


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
LearningPath

GET
students/{sId}/learning-path
POST
students/{sId}/learning-path
PATCH
students/{sId}/learning-path

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
CARD

GET
/topics?level=?&subject=?
/topics/{id}/subtopics
/topics/{id}/subtopics/{id}/cards









