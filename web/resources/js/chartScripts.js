// Chart 1
// ========================================================================
var char1El = document.getElementById('chart1');
new Chart(char1El, {
  type: 'bar',
  data: {
    labels: ["Grupo A", "Grupo B", "Grupo C", "Grupo D", "Grupo E"],
    datasets: [{
      label: "Extrella",
      backgroundColor: ["#39f", "#895df6", "#3cba9f", "#e8c3b9", "#c45850"],
      data: [578, 267, 600, 900, 700]
    }]
  },
  
  options: {
    maintainAspectRatio: false,
    responsiveAnimationDuration: 500,
    legend: {
      display: false
    },
    animation: {
      duration: 2000
    },
    title: {
      display: true,
      text: 'Calficacion general del grupo'
    }
  }
});

// Chart 2
// ========================================================================
var char2El = document.getElementById('chart2');

new Chart(char2El, {
  type: 'doughnut',
  data: {
    labels: ["Listening", "Reading", "Speaking", "Writing", "Mental Map"],
    datasets: [
      {
        label: "Rendimiento",
        backgroundColor: ["#39f", "#895df6","#3cba9f","#e8c3b9","#c45850"],
        data: [2478,5267,734,784,433]
      }
    ]
  },
  options: {
    maintainAspectRatio: false,
    responsiveAnimationDuration: 500,
    animation: {
      duration: 2000
    },
    title: {
      display: true,
      text: 'the best student of the classes'
    }
  }
});

// Chart 3
// ========================================================================
var char3El = document.getElementById('chart3');

new Chart(char3El, {
  type: 'radar',
  data: {
    labels: ["Listening", "Reading", "Speaking", "Writing", "Mental Map"],
    datasets: [{
      label: "Grupo A",
      fill: true,
      backgroundColor: "rgba(51,153,255,0.6)",
      borderColor: "rgba(51,153,255,0.2)",

      pointBorderColor: "#fff",
      pointBackgroundColor: "rgba(179,181,198,1)",
      data: [2.33, 5.61, 6.69, 9.32, 8.2]
    }]
  },
  options: {
    maintainAspectRatio: false,
    responsiveAnimationDuration: 500,
    animation: {
      duration: 2000
    },
    title: {
      display: true,
      text: 'Distribution in % of world population'
    }
  }
});



// Chart 4
// ========================================================================
var char4El = document.getElementById('chart4');
  new Chart(char4El, {
    type: 'radar',
    data: {
      labels: ["Listening", "Reading", "Speaking", "Writing", "Mental Map"],
      datasets: [{
        label: "Grupo B",
        fill: true,
        backgroundColor: "rgba(137, 93, 246,0.2)",
        borderColor: "rgba(137, 93, 246,1)",
        pointBorderColor: "#fff",
        pointBackgroundColor: "rgba(137, 93, 246,1)",
        pointBorderColor: "#fff",
        data: [7.25, 8.25, 6, 9.1, 4.45]
      } ]
    },
    options: {
      maintainAspectRatio: false,
      responsiveAnimationDuration: 500,
      animation: {
        duration: 2000
      },
      title: {
        display: true,
        text: 'Distribution in % of world population'
      }
    }
  });



// Chart 5
// ========================================================================
var char5El = document.getElementById('chart5');
new Chart(char5El, {
  type: 'radar',
  data: {
    labels: ["Listening", "Reading", "Speaking", "Writing", "Mental Map"],
    datasets: [{
      label: "Grupo C",
      fill: true,
      backgroundColor: "rgba(60, 186, 159  ,0.2)",
      borderColor: "rgba(60, 186, 159  ,1)",
      pointBorderColor: "#fff",
      pointBackgroundColor: "rgba(60, 186, 159  ,1)",
      pointBorderColor: "#fff",
      data: [7.25, 8.25, 6, 9.1, 4.45]
    } ]
  },
  options: {
    maintainAspectRatio: false,
    responsiveAnimationDuration: 500,
    animation: {
      duration: 2000
    },
    title: {
      display: true,
      text: 'Distribution in % of world population'
    }
  }
});




// Chart 6
// ========================================================================
var char6El = document.getElementById('chart6');

new Chart(char6El, {
  type: 'line',
  data: {
    labels: [2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018],
    datasets: [{
      data: [2004, 2000, 3200, 1200, 3450, 2300, 2200, 1200, 900, 1450],
      label: "Africa",
      borderColor: "#39f",
      fill: false
    }, {
      data: [4500, 4800, 5200, 5000, 5200, 5500, 5900, 6500, 6800, 7200],
      label: "Asia",
      borderColor: "#895df6",
      fill: false
    }, {
      data: [3400, 3200, 2800, 5600, 4500, 3200, 3400, 3800, 4800, 4200],
      label: "Europe",
      borderColor: "#3cba9f",
      fill: false
    }, {
      data: [1200, 1100, 1250, 1200, 1300, 1450, 1300, 1200, 1320, 1350],
      label: "Latin America",
      borderColor: "#e8c3b9",
      fill: false
    }, {
      data: [600, 3400, 2000, 1200, 7500, 2300, 3200, 6000, 3400, 4500],
      label: "North America",
      borderColor: "#c45850",
      fill: false
    }]
  },
  options: {
    maintainAspectRatio: false,
    responsiveAnimationDuration: 500,
    animation: {
      duration: 2000
    },
    title: {
      display: true,
      text: 'Sales per region'
    }
  }
});