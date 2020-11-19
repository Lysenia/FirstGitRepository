$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("common_functionality.feature");
formatter.feature({
  "line": 2,
  "name": "testing common functionality for different users",
  "description": "",
  "id": "testing-common-functionality-for-different-users",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@temp"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Min_Max_Room_Reservation",
  "description": "",
  "id": "testing-common-functionality-for-different-users;min-max-room-reservation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "the \u003cuser\u003e is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the \u003cuser\u003e goes to hunt",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the \u003cuser\u003e should be able to reserve room from 30 minutes to 2 hours",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "testing-common-functionality-for-different-users;min-max-room-reservation;",
  "rows": [
    {
      "cells": [
        "user"
      ],
      "line": 12,
      "id": "testing-common-functionality-for-different-users;min-max-room-reservation;;1"
    },
    {
      "cells": [
        "teacher"
      ],
      "line": 13,
      "id": "testing-common-functionality-for-different-users;min-max-room-reservation;;2"
    },
    {
      "cells": [
        "tech-lead"
      ],
      "line": 14,
      "id": "testing-common-functionality-for-different-users;min-max-room-reservation;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Min_Max_Room_Reservation",
  "description": "",
  "id": "testing-common-functionality-for-different-users;min-max-room-reservation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@temp"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the teacher is on home page",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the teacher goes to hunt",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the teacher should be able to reserve room from 30 minutes to 2 hours",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 14,
  "name": "Min_Max_Room_Reservation",
  "description": "",
  "id": "testing-common-functionality-for-different-users;min-max-room-reservation;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@temp"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the tech-lead is on home page",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the tech-lead goes to hunt",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the tech-lead should be able to reserve room from 30 minutes to 2 hours",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 16,
      "value": "#reservation should be given in \"from $ time to $time\" format"
    }
  ],
  "line": 18,
  "name": "Reservation_Format",
  "description": "",
  "id": "testing-common-functionality-for-different-users;reservation-format",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@SPA-1284"
    },
    {
      "line": 17,
      "name": "@SPA-1546"
    },
    {
      "line": 17,
      "name": "@SPA-1241"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "the \u003cuser\u003e is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "the \u003cuser\u003e goes to hunt",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "reservation options should be given in a format:from $ time to $time",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "testing-common-functionality-for-different-users;reservation-format;",
  "rows": [
    {
      "cells": [
        "user"
      ],
      "line": 25,
      "id": "testing-common-functionality-for-different-users;reservation-format;;1"
    },
    {
      "cells": [
        "teacher"
      ],
      "line": 26,
      "id": "testing-common-functionality-for-different-users;reservation-format;;2"
    },
    {
      "cells": [
        "tech-lead"
      ],
      "line": 27,
      "id": "testing-common-functionality-for-different-users;reservation-format;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "Reservation_Format",
  "description": "",
  "id": "testing-common-functionality-for-different-users;reservation-format;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@SPA-1546"
    },
    {
      "line": 1,
      "name": "@temp"
    },
    {
      "line": 17,
      "name": "@SPA-1241"
    },
    {
      "line": 17,
      "name": "@SPA-1284"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "the teacher is on the home page",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "the teacher goes to hunt",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "reservation options should be given in a format:from $ time to $time",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 27,
  "name": "Reservation_Format",
  "description": "",
  "id": "testing-common-functionality-for-different-users;reservation-format;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@SPA-1546"
    },
    {
      "line": 1,
      "name": "@temp"
    },
    {
      "line": 17,
      "name": "@SPA-1241"
    },
    {
      "line": 17,
      "name": "@SPA-1284"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "the tech-lead is on the home page",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "the tech-lead goes to hunt",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "reservation options should be given in a format:from $ time to $time",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 29,
      "value": "#{color:#000000}Reservation window for the day should be from 7am to 10 pm{color}"
    }
  ],
  "line": 31,
  "name": "Reservation_Window_Display",
  "description": "",
  "id": "testing-common-functionality-for-different-users;reservation-window-display",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@SPA-1287"
    },
    {
      "line": 30,
      "name": "@SPA-1546"
    },
    {
      "line": 30,
      "name": "@SPA-1241"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "the \u003cuser\u003e is on hunt page",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "the \u003cuser\u003e enters valid date",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "reservation window for the day should be from 7am to 10 pm",
  "keyword": "Then "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "testing-common-functionality-for-different-users;reservation-window-display;",
  "rows": [
    {
      "cells": [
        "user"
      ],
      "line": 38,
      "id": "testing-common-functionality-for-different-users;reservation-window-display;;1"
    },
    {
      "cells": [
        "teacher"
      ],
      "line": 39,
      "id": "testing-common-functionality-for-different-users;reservation-window-display;;2"
    },
    {
      "cells": [
        "tech-lead"
      ],
      "line": 40,
      "id": "testing-common-functionality-for-different-users;reservation-window-display;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 39,
  "name": "Reservation_Window_Display",
  "description": "",
  "id": "testing-common-functionality-for-different-users;reservation-window-display;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@SPA-1287"
    },
    {
      "line": 30,
      "name": "@SPA-1546"
    },
    {
      "line": 1,
      "name": "@temp"
    },
    {
      "line": 30,
      "name": "@SPA-1241"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "the teacher is on hunt page",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "the teacher enters valid date",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "reservation window for the day should be from 7am to 10 pm",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 40,
  "name": "Reservation_Window_Display",
  "description": "",
  "id": "testing-common-functionality-for-different-users;reservation-window-display;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@SPA-1287"
    },
    {
      "line": 30,
      "name": "@SPA-1546"
    },
    {
      "line": 1,
      "name": "@temp"
    },
    {
      "line": 30,
      "name": "@SPA-1241"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "the tech-lead is on hunt page",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "the tech-lead enters valid date",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "reservation window for the day should be from 7am to 10 pm",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 42,
      "value": "#{color:#000000}In the hunt for spot page ,date field should be calendar{color}"
    }
  ],
  "line": 44,
  "name": "Hunt_SpotPage_Field_Check",
  "description": "",
  "id": "testing-common-functionality-for-different-users;hunt-spotpage-field-check",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 43,
      "name": "@SPA-1288"
    },
    {
      "line": 43,
      "name": "@SPA-1241"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "the \u003cuser\u003e is on the hunt page",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "the \u003cuser\u003e goes to date",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "the calendar should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 49,
  "name": "",
  "description": "",
  "id": "testing-common-functionality-for-different-users;hunt-spotpage-field-check;",
  "rows": [
    {
      "cells": [
        "user"
      ],
      "line": 51,
      "id": "testing-common-functionality-for-different-users;hunt-spotpage-field-check;;1"
    },
    {
      "cells": [
        "teacher"
      ],
      "line": 52,
      "id": "testing-common-functionality-for-different-users;hunt-spotpage-field-check;;2"
    },
    {
      "cells": [
        "tech-lead"
      ],
      "line": 53,
      "id": "testing-common-functionality-for-different-users;hunt-spotpage-field-check;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 52,
  "name": "Hunt_SpotPage_Field_Check",
  "description": "",
  "id": "testing-common-functionality-for-different-users;hunt-spotpage-field-check;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 43,
      "name": "@SPA-1288"
    },
    {
      "line": 1,
      "name": "@temp"
    },
    {
      "line": 43,
      "name": "@SPA-1241"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "the teacher is on the hunt page",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "the teacher goes to date",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "the calendar should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 53,
  "name": "Hunt_SpotPage_Field_Check",
  "description": "",
  "id": "testing-common-functionality-for-different-users;hunt-spotpage-field-check;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 43,
      "name": "@SPA-1288"
    },
    {
      "line": 1,
      "name": "@temp"
    },
    {
      "line": 43,
      "name": "@SPA-1241"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "the tech-lead is on the hunt page",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "the tech-lead goes to date",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "the calendar should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "comments": [
    {
      "line": 56,
      "value": "#Verify hunt for spot page is displayed when the teacher clicks on the hunt link at home page."
    }
  ],
  "line": 58,
  "name": "Hunt_For_Spot_Page_Display",
  "description": "",
  "id": "testing-common-functionality-for-different-users;hunt-for-spot-page-display",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 57,
      "name": "@SPA-1295"
    },
    {
      "line": 57,
      "name": "@SPA-1546"
    },
    {
      "line": 57,
      "name": "@SPA-1241"
    }
  ]
});
formatter.step({
  "line": 60,
  "name": "the teacher is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 61,
  "name": "the teacher clicks on the hunt link",
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "hunt for a spot page should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});