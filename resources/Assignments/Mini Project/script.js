// Get the root element to attach calculator
const root = document.getElementById("root");

// calculator container div
const calc = document.createElement("div");
calc.classList.add("calculator");

// Create display input
const display = document.createElement("input");
display.type = "text";
display.readOnly = true;
calc.appendChild(display);

// Define calculator buttons
const buttons = [
  ["C", "←", ".", "*"],
  ["7", "8", "9", "/"],
  ["4", "5", "6", "-"],
  ["1", "2", "3", "+"],
  ["0", "00"],
  ["="], // '=' is full width button for apperence
];

// Loop through each row of buttons to create DOM elements
buttons.forEach((rowVals) => {
  const row = document.createElement("div");
  row.classList.add("row");

  // Special styling for '=' button row (full width)
  if (rowVals.length === 1 && rowVals[0] === "=") {
    const col = document.createElement("div");
    col.classList.add("col");

    const btn = document.createElement("button");
    btn.innerText = "=";
    btn.classList.add("btn", "btn-success");

    // Add click event listener for '=' button
    btn.addEventListener("click", () => buttonClick("="));

    col.appendChild(btn);
    row.appendChild(col);
    row.classList.add("equal-row"); // xtra margin on top
  } else {
    // For other buttons in the row
    rowVals.forEach((val) => {
      const col = document.createElement("div");
      col.classList.add("col");

      const btn = document.createElement("button");
      btn.innerText = val;

      // Assign color classes based on button type
      if (val === "C") {
        btn.classList.add("btn", "btn-danger");
      } else if (val === "←") {
        btn.classList.add("btn", "btn-secondary");
      } else if (["/", "*", "-", "+"].includes(val)) {
        btn.classList.add("btn", "btn-warning");
      } else {
        btn.classList.add("btn", "btn-primary");
      }

      // Add click event listener for each button
      btn.addEventListener("click", () => buttonClick(val));

      col.appendChild(btn);
      row.appendChild(col);
    });
  }

  // Append constructed row to calculator container
  calc.appendChild(row);
});

// Finally, append calculator to root div
root.appendChild(calc);

/**
 * Function to handle button clicks
 * @param {string} value - Button value clicked
 */
function buttonClick(value) {
  if (value === "C") {
    display.value = ""; // Clear display
  } else if (value === "←") {
    display.value = display.value.slice(0, -1); // Backspace functionality
  } else if (value === "=") {
    try {
      display.value = eval(display.value); // Evaluate the expression
    } catch {
      display.value = "Error"; // Show error if invalid expression
    }
  } else {
    display.value += value; // Append clicked value to display
  }
}

// Add keyboard support for numbers and operators
document.addEventListener("keydown", (e) => {
  const allowedKeys = [
    "0",
    "1",
    "2",
    "3",
    "4",
    "5",
    "6",
    "7",
    "8",
    "9",
    ".",
    "+",
    "-",
    "*",
    "/",
    "%",
    "Backspace",
    "Enter",
  ];

  if (!allowedKeys.includes(e.key)) {
    alert("Only numbers are allowed"); // Alert for disallowed keys
    e.preventDefault();
  } else {
    if (e.key === "Enter") {
      try {
        display.value = eval(display.value);
      } catch {
        display.value = "Error";
      }
    } else if (e.key === "Backspace") {
      display.value = display.value.slice(0, -1);
    } else {
      display.value += e.key;
    }
  }
});
