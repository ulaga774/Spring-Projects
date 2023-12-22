<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Land Records</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
    display: flex;
    flex-direction: column;
    min-height: 100vh;
    margin: 0;
    padding: 0;
}

header {
	background-color: black;
	color: green;
	text-align: center;
	padding: 10px;
}

header a {
	color: white;
	text-decoration: none;
}

.topic {
	color: white;
}

.content-wrapper {
    display: flex;
    justify-content: center;
    align-items: stretch; /* Stretch both left and right content */
}

.content-left {
    padding: 50px;
   flex: 1; /* Equal width */
}

.content-right {
    padding: 50px;
    flex: 1; /* Equal width */
}

input[type="text"],
input[type="number"],
select {
    width: 100%;
    
    color: black;
    padding: 5px;
    margin-bottom: 10px;
}
label {
    font-weight: bold;
    color: #000; /* Dark black color */
}


footer {
    background-color: black;
    color: white;
    text-align: center;
    padding: 10px;
}

#footerButton {
    background-color: #000;
    color: #fff;
    text-align: center;
}

#footerButton a {
    color: #fff;
    text-decoration: none;
}
.button-container {
            text-align: center;
            margin: 20px 0; 
}

      </style>
    
<script>
    function populateDropdowns() {
        var selectedState = document.getElementById("state").value;
        var districtDropdown = document.getElementById("district");
        var talukDropdown = document.getElementById("taluk"); // Fix this line
        var hobliDropdown = document.getElementById("hobli");
        var villageDropdown = document.getElementById("village");

        talukDropdown.innerHTML = ""; // Clear existing options
        districtDropdown.innerHTML = "";
        hobliDropdown.innerHTML = "";
        villageDropdown.innerHTML = "";

        if (selectedState === "TamilNadu") {
            populateDropdown(districtDropdown, [
                "--Select District--",
                "Coimbatore",
                "Dharmapuri"
            ]);
        }
            else if (selectedState === "Karnataka") {
            populateDropdown(districtDropdown, [
            "--Select District--",
                "Belgaum",
                "Mysore",
                "Shivamogga",
                "Mandya"
             ]);
        }
        
// Add an event listener to populate the taluk dropdown when the district changes
document.getElementById("district").addEventListener("change", function() {
    var selectedDistrict = this.value;
    var talukDropdown = document.getElementById("taluk");
    talukDropdown.innerHTML = ""; // Clear existing options

    if (selectedDistrict === "Coimbatore") {
        populateDropdown(talukDropdown, [
            "--Select Taluk--",
            "Palladam",
            "Pollachi",
            "Mettupalayam",
            "Udamalpet"
        ]);
    } else if (selectedDistrict === "Dharmapuri") {
        populateDropdown(talukDropdown, [
            "--Select Taluk--",
            "Harur",
            "Palacode",
            "Pennagaram",
            "Dharmapuri"
        ]);
    }
    // karnataka
    else if (selectedDistrict === "Shivamogga") {
        populateDropdown(talukDropdown, [
        "--Select Taluk--",
            "Hosanagara",
            "Sagara",
            "Soraba",
            "Thirthahalli"
        ]);
    }
    else if (selectedDistrict === "Mandya") {
        populateDropdown(talukDropdown, [
        "--Select Taluk--",
            "Krpet",
            "Maddur",
            "Nagamangala",
            "Pandavapura"
        ]);
    }
    else if (selectedDistrict === "Mysore") {
        populateDropdown(talukDropdown, [
        "--Select Taluk--",
            "Heggadadevanakote",
            "Hunsur",
            "Mysore",
            "Nanjangud"
        ]);
    } 
    else if (selectedDistrict === "Belgaum") {
        populateDropdown(talukDropdown, [
        "--Select Taluk--",
            "Gokak",
            "Khanapur",
            "Raibag",
            "Ramdurg"
        ]);
    }
});

document.getElementById("taluk").addEventListener("change", function() {
    var selectedTaluk = this.value;
    var hobliDropdown = document.getElementById("hobli");
    hobliDropdown.innerHTML = ""; // Clear existing options

                    // Coimbatore

    if (selectedTaluk === "Palladam") {
        populateDropdown(hobliDropdown, [
            "--Select hobli--",
            "Arjothi Nagar",
            "Palladam"
        ]);
    } else if (selectedTaluk === "Pollachi") {
        populateDropdown(hobliDropdown, [
            "--Select hobli--",
            "Achipatti",
            "Alagirichettipalayam"
        ]);
    }
    else if (selectedTaluk === "Mettupalayam") {
        populateDropdown(hobliDropdown, [
            "--Select hobli--",
            "Akkaraisengapalli",
            "Alancombu"
        ]);
    }
    else if (selectedTaluk === "Udamalpet") {
        populateDropdown(hobliDropdown, [
            "--Select hobli--",
            "Amandakadavoo",
            "Amaravathi Nagar"
        ]);
    }
                    // Dharmapuri
     else if (selectedTaluk === "Harur") {
        populateDropdown(hobliDropdown, [
            "--Select hobli--",
            "Naripalli",
            "ThirathaMalai"
        ]);
    }
    else if (selectedTaluk === "Palacode") {
        populateDropdown(hobliDropdown, [
            "--Select hobli--",
            "Theerthagiri Nagar",
            "Begarahalli"
        ]);
    }
    else if (selectedTaluk === "Dharmapuri") {
        populateDropdown(hobliDropdown, [
            "--Select hobli--",
            "A Gollahalli",
            "A Jettihalli"
        ]);
    }
    else if (selectedTaluk === "Pennagaram") {
        populateDropdown(hobliDropdown, [
            "--Select hobli--",
            "Adagapadi",
            "Ajjanahalli"
        ]);
    }
                     // Karnataka
    else if (selectedTaluk === "Hosanagara") {
    populateDropdown(hobliDropdown, [
        "--Select hobli--",
        "Huncha",
        "Nagara"
    ]);
} else if (selectedTaluk === "Thirthahalli") {
    populateDropdown(hobliDropdown, [
        "--Select hobli--",
        "Agrahara",
        "Agumbe"
    ]);
} else if (selectedTaluk === "Sagara") {
    populateDropdown(hobliDropdown, [
        "--Select hobli--",
        "Anandapura",
        "Avinahalli"
    ]);
} else if (selectedTaluk === "Soraba") {
    populateDropdown(hobliDropdown, [
        "--Select hobli--",
        "Jade",
        "Ulavi"
    ]);
} else if (selectedTaluk === "Krpet") {
    populateDropdown(hobliDropdown, [
        "--Select hobli--",
        "Akkihebbal",
        "Bukinakere"
    ]);
} else if (selectedTaluk === "Maddur") {
    populateDropdown(hobliDropdown, [
        "--Select hobli--",
        "Ataguru Hobli",
        "Koppa Hobali"
    ]);
} else if (selectedTaluk === "Pandavapura") {
    populateDropdown(hobliDropdown, [
        "--Select hobli--",
        "Chinakurali",
        "Melukote"
    ]);
} else if (selectedTaluk === "Nagamangala") {
    populateDropdown(hobliDropdown, [
        "--Select hobli--",
        "Belluru",
        "Bindiganaville"
    ]);
} else if (selectedTaluk === "Mysore") {
    populateDropdown(hobliDropdown, [
        "--Select hobli--",
        "Kasaba",
        "Varuna"
    ]);
} else if (selectedTaluk === "Heggadadevanakote") {
    populateDropdown(hobliDropdown, [
        "--Select hobli--",
        "Antarasante",
        "Hampapura"
    ]);
} else if (selectedTaluk === "Hunsur") {
    populateDropdown(hobliDropdown, [
        "--Select hobli--",
        "Bilikere",
        "Gavadagere"
    ]);
} else if (selectedTaluk === "Nanjangud") {
    populateDropdown(hobliDropdown, [
        "--Select hobli--",
        "Chikkayyanachatra",
        "Hullahalli"
    ]);
} else if (selectedTaluk === "Raibag") {
    populateDropdown(hobliDropdown, [
        "--Select hobli--",
        "Kudachi",
        "Raybaga"
    ]);
} else if (selectedTaluk === "Gokak") {
    populateDropdown(hobliDropdown, [
        "--Select hobli--",
        "Gokak",
        "Kowjalagi"
    ]);
} else if (selectedTaluk === "Ramdurg") {
    populateDropdown(hobliDropdown, [
        "--Select hobli--",
        "K Chandaragi",
        "Katakola"
    ]);
} else if (selectedTaluk === "Khanapur") {
    populateDropdown(hobliDropdown, [
        "--Select hobli--",
        "Beedi",
        "Gunji"
    ]);
}
});

// Add an event listener to populate the "Village" dropdown based on the selected "hobli"
document.getElementById("hobli").addEventListener("change", function() {
    var selectedhobli = this.value;
    var villageDropdown = document.getElementById("village");
    villageDropdown.innerHTML = ""; // Clear existing options

    // Dharmapuri villages
    if (selectedhobli === "Naripalli") {
        populateDropdown(villageDropdown, [
            "--Select Village--",
            "Venkatramapuram",
            "Kottapatti"
        ]);
    } else if (selectedhobli === "ThirathaMalai") {
        populateDropdown(villageDropdown, [
            "--Select Village--",
            "Kurumpatty",
            "Andiyur"
        ]);
    }
    else if (selectedhobli === "Theerthagiri Nagar") {
        populateDropdown(villageDropdown, [
            "--Select Village--",
            "K.G.M Hospital",
            "Mayura Street"
        ]);
    }
    else if (selectedhobli === "Begarahalli") {
        populateDropdown(villageDropdown, [
            "--Select Village--",
            "Saniyoor Sai Mariyamman temple",
            "Sanitoor"
        ]);
    }
    else if (selectedhobli === "A Gollahalli") {
        populateDropdown(villageDropdown, [
            "--Select Village--",
            "Velipettai ST",
            "Valampuri Vinayagar"
        ]);
    }
    else if (selectedhobli === "A Jettihalli") {
        populateDropdown(villageDropdown, [
            "--Select Village--",
            "Vankatampatti",
            "Oddapatti"
        ]);
    }
    else if (selectedhobli === "Adagapadi") {
        populateDropdown(villageDropdown, [
            "--Select Village--",
            "Dr BR Ambadkar Colony",
            "KMK Temple Colony"
        ]);
    }
    else if (selectedhobli === "Ajjanahalli") {
        populateDropdown(villageDropdown, [
            "--Select Village--",
            "Kodukkaattai",
            "Muniyappan Temple Street"
        ]);
    }
    
    // Coimbatore villages 

    else if (selectedhobli === "Arjothi Nagar") {
        populateDropdown(villageDropdown, [
            "--Select Village--",
            "ESI",
            "GandhiNagar"
        ]);
    }
    else if (selectedhobli === "Palladam") {
        populateDropdown(villageDropdown, [
            "--Select Village--",
            "N G R Salai Rode",
            "Sri Krishna Skilks"
        ]);
    }
    else if (selectedhobli === "Achipatti") {
        populateDropdown(villageDropdown, [
            "--Select Village--",
            "Old Vinayagar Temple Street",
            "Achipatti RamaSamy"
        ]);
    }
    else if (selectedhobli === "Alagirichettipalayam") {
        populateDropdown(villageDropdown, [
            "--Select Village--",
            "Sulakkal Rode",
            "Pechi Ammman Temple Street"
        ]);
    }
    else if (selectedhobli === "Akkaraisengapalli") {
        populateDropdown(villageDropdown, [
            "--Select Village--",
            "Karthik Poultry farm",
            "Kovilpalayam"
        ]);
    }
    else if (selectedhobli === "Alancombu") {
        populateDropdown(villageDropdown, [
            "--Select Village--",
            "Nagar Kovil",
            "Thirupathi Venkatachalapathi Temple"
        ]);
    }
    else if (selectedhobli === "Amandakadavoo") {
        populateDropdown(villageDropdown, [
            "--Select Village--",
            "Old Vinayagar Temple Street",
            "Thirupathi Venkatachalapathi Temple"
        ]);
    }
    else if (selectedhobli === "Amaravathi Nagar") {
        populateDropdown(villageDropdown, [
            "--Select Village--",
            "KSRPP.MILK PTE LTD",
            "Solaiandavar Temple"
        ]);
    }
    
    // Karnataka villages
    else if (selectedhobli === "Huncha") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Amruta",
        "Anegadde",
        "Billodi",
        "Borikoppa"
    ]);
} else if (selectedhobli === "Nagara") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Andagaduduru",
        "Baise",
        "Kabale",
        "Kadigeri"
    ]);
} else if (selectedhobli === "Agrahara") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Agalabagilu",
        "Agasadi",
        "Aluru",
        "Aralasurali"
    ]);
} else if (selectedhobli === "Agumbe") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Arehalli",
        "Balehalli",
        "Chakkodabilu",
        "Changara"
    ]);
} else if (selectedhobli === "Anandapura") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Achapura",
        "Aduru",
        "Atavdi",
        "Ballibyelu"
    ]);
} else if (selectedhobli === "Avinahalli") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Ambaragodlu",
        "Araleekoppa",
        "Besuru",
        "Devasa"
    ]);
} else if (selectedhobli === "Jade") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Aretalagadde",
        "Banksana",
        "Bankavalli",
        "Bilagali"
    ]);
} else if (selectedhobli === "Ulavi") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Avalagodu",
        "Balagodu",
        "Barige",
        "Bhadrapura"
    ]);
} else if (selectedhobli === "Akkihebbal") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Aipanahalli",
        "Akkihebbal",
        "Alambadi",
        "Alenahalli"
    ]);
} else if (selectedhobli === "Bukinakere") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Agasarahalli",
        "Aichanahalli",
        "Aralakuppe",
        "Attuppe"
    ]);
} else if (selectedhobli === "Ataguru Hobli") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Alanshettihalli",
        "Ankanathapura",
        "Ataguru",
        "Byaladakere"
    ]);
} else if (selectedhobli === "Koppa Hobali") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Bekkalale",
        "Bolare",
        "Hosagali",
        "Kiranguru"
    ]);
} else if (selectedhobli === "Belluru") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Adakatahalli",
        "Agachahalli",
        "Ambalajeerahalli",
        "Anakanahalli"
    ]);
} else if (selectedhobli === "Bindiganaville") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "A Chennapura",
        "A Nagattihalli",
        "Addihalli",
        "Aleesandra"
    ]);
} else if (selectedhobli === "Chinakurali") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Alphalli",
        "Antanahalli",
        "Aralakuppe",
        "Aralakuppenala"
    ]);
} else if (selectedhobli === "Melukote") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Amruthi",
        "Anunahalli",
        "Anuvallu",
        "Arakanakere"
    ]);
} else if (selectedhobli === "Kasaba") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Bogadi",
        "Goruru",
        "Kesare",
        "Satagalli"
    ]);
} else if (selectedhobli === "Varuna") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Dandikere",
        "Hongate",
        "Marashe",
        "Yadakola"
    ]);
} else if (selectedhobli === "Antarasante") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Anagatti",
        "Anemala",
        "Hosuru",
        "Jiyara"
    ]);
} else if (selectedhobli === "Hampapura") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Bettahalli",
        "Devalapura",
        "Karigala",
        "Pura"
    ]);
} else if (selectedhobli === "Bilikere") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Asvalu",
        "Dallalu",
        "Madlapura",
        "Tippuru"
    ]);
} else if (selectedhobli === "Gavadagere") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Agrahara",
        "Attiguppe",
        "Belatturu",
        "Harave"
    ]);
} else if (selectedhobli === "Chikkayyanachatra") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Adakananahalli",
        "Alatturu",
        "Basavanapura",
        "Bidaragudu"
    ]);
} else if (selectedhobli === "Hullahalli") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Akala",
        "Amakalli",
        "Ambale",
        "Ariyuru"
    ]);
} else if (selectedhobli === "Kudachi") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Kudachi",
        "Moraba",
        "Mugalakhoda",
        "Neelaji"
    ]);
} else if (selectedhobli === "Raybaga") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Bavachi",
        "Chinchali",
        "Devanakatti",
        "Jodatti"
    ]);
} else if (selectedhobli === "Gokak") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Balobal",
        "Budihala",
        "Dandapur",
        "Gokaka"
    ]);
} else if (selectedhobli === "Kowjalagi") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Adibatti",
        "Betageri",
        "Kandratti",
        "Mannikeri"
    ]);
} else if (selectedhobli === "K Chandaragi") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Beedaki",
        "Bhagojikoppa",
        "Bijagupi",
        "Budanura"
    ]);
} else if (selectedhobli === "Katakola") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Aribenchi",
        "Bannura",
        "Bochabala",
        "Chilamura"
    ]);
} else if (selectedhobli === "Beedi") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Adi",
        "Balagunda",
        "Beedi",
        "Bhuranaki"
    ]);
} else if (selectedhobli === "Gunji") {
    populateDropdown(villageDropdown, [
        "--Select Village--",
        "Abanalle",
        "Akralli",
        "Ambevadi",
        "Anagadi"
    ]);
} 


});

}
function populateDropdown(dropdown, options) {
        for (var i = 0; i < options.length; i++) {
            var option = document.createElement("option");
            option.value = options[i];
            option.text = options[i];
            dropdown.appendChild(option);
        }
    }


</script>

</head>

<body>
   <header>
		<div class="d-flex justify-content-between">
			<div class="topic">
   			 <h4>Welcome ${AdminName}</h4>
    	</div>

			<a href="index.jsp">Home</a>
		</div>
	</header>
    <form action="addrecords" method="post">
        <div class="content-wrapper">
            <div class="content-left">
                <label for="state">State:</label>
                <select name="state" id="state" onchange="populateDropdowns()" aria-placeholder="Select State">
                    <option>--Select State--</option>
                    <option value="TamilNadu">TamilNadu</option>
                    <option value="Karnataka">Karnataka</option>
                    
                </select>
        
                <label for="district">District:</label>
                <select name="district" id="district" aria-placeholder="Select State">
                    <option value="--Select District--">--Select District--</option>
                    <option value="Coimbatore">Coimbatore</option>
                    <option value="Dharmapuri">Dharmapuri</option>
                    <option value="Belgaum">Belgaum</option>
                    <option value="Mysore">Mysore</option>
                    <option value="Shivamogga">Shivamogga</option>
                    <option value="Mandya">Mandya</option>
                </select>
                
    
                <label for="taluk">Taluk:</label >
                    <select name="taluk" id="taluk" aria-placeholder="Select Taluk">
                        <option value="--Select Taluk--">--Select Taluk--</option>
                        <option value="Palladam">Palladam</option>
                        <option value="Pollachi">Pollachi</option>
                        <option value="Mettupalayam">Mettupalayam</option>
                        <option value="Udamalpet">Udamalpet</option>
                        <option value="Harur">Harur</option>
                        <option value="Palacode">Palacode</option>
                        <option value="Dharmapuri">Dharmapuri</option>
                        <option value="Pennagaram">Pennagaram</option>
                        <option value="Hosanagara">Hosanagara</option>
                        <option value="Thirthahalli">Thirthahalli</option>
                        <option value="Sagara">Sagara</option>
                        <option value="Soraba">Soraba</option>
                        <option value="Krpet">Krpet</option>
                        <option value="Maddur">Maddur</option>
                        <option value="Pandavapura">Pandavapura</option>
                        <option value="Nagamangala">Nagamangala</option>
                        <option value="Mysore">Mysore</option>
                        <option value="Heggadadevanakote">Heggadadevanakote</option>
                        <option value="Hunsur">Hunsur</option>
                        <option value="Nanjangud">Nanjangud</option>
                        <option value="Raibag">Raibag</option>
                        <option value="Gokak">Gokak</option>
                        <option value="Ramdurg">Ramdurg</option>
                        <option value="Khanapur">Khanapur</option>
                    </select>
                    
                            
                <label for="hobli">hobli:</label>
                    <select name="hobli" id="hobli" aria-placeholder="Select Hobli">
                        <option value="--Select Hobli--">--Select Hobli--</option>
                        <!-- Add TamilNadu hobli options here -->
                        <option value="Arjothi Nagar">Arjothi Nagar</option>
                        <option value="Palladam">Palladam</option>
                        <option value="Achipatti">Achipatti</option>
                        <option value="Alagirichettipalayam">Alagirichettipalayam</option>
                        <option value="Akkaraisengapalli">Akkaraisengapalli</option>
                        <option value="Alancombu">Alancombu</option>
                        <option value="Amandakadavoo">Amandakadavoo</option>
                        <option value="Amaravathi Nagar">Amaravathi Nagar</option>
                        <!-- Add Karnataka hobli options here -->
                        <option value="Huncha">Huncha</option>
                        <option value="Nagara">Nagara</option>
                        <option value="Agrahara">Agrahara</option>
                        <option value="Agumbe">Agumbe</option>
                        <option value="Anandapura">Anandapura</option>
                        <option value="Avinahalli">Avinahalli</option>
                        <option value="Jade">Jade</option>
                        <option value="Ulavi">Ulavi</option>
                        <option value="Akkihebbal">Akkihebbal</option>
                        <option value="Bukinakere">Bukinakere</option>
                        <option value="Ataguru Hobli">Ataguru Hobli</option>
                        <option value="Koppa Hobali">Koppa Hobali</option>
                        <option value="Chinakurali">Chinakurali</option>
                        <option value="Melukote">Melukote</option>
                        <option value="Belluru">Belluru</option>
                        <option value="Bindiganaville">Bindiganaville</option>
                        <option value="Kasaba">Kasaba</option>
                        <option value="Varuna">Varuna</option>
                        <option value="Antarasante">Antarasante</option>
                        <option value="Hampapura">Hampapura</option>
                        <option value="Bilikere">Bilikere</option>
                        <option value="Gavadagere">Gavadagere</option>
                        <option value="Chikkayyanachatra">Chikkayyanachatra</option>
                        <option value="Hullahalli">Hullahalli</option>
                        <option value="Kudachi">Kudachi</option>
                        <option value="Raybaga">Raybaga</option>
                        <option value="Gokak">Gokak</option>
                        <option value="Kowjalagi">Kowjalagi</option>
                        <option value="K Chandaragi">K Chandaragi</option>
                        <option value="Katakola">Katakola</option>
                        <option value="Beedi">Beedi</option>
                        <option value="Gunji">Gunji</option>
                        
                    </select>
                    
                </select>
    
                <label for="village">Village:</label>
                <select name="village" id="village" aria-placeholder="Select Village">
                    <option value="--Select Village--">--Select Village--</option>
                    <!-- Dharmapuri Villages -->
                    <option value="Venkatramapuram">Venkatramapuram</option>
                    <option value="Kottapatti">Kottapatti</option>
                    <option value="Kurumpatty">Kurumpatty</option>
                    <option value="Andiyur">Andiyur</option>
                    <option value="K.G.M Hospital">K.G.M Hospital</option>
                    <option value="Mayura Street">Mayura Street</option>
                    <option value="Saniyoor Sai Mariyamman temple">Saniyoor Sai Mariyamman temple</option>
                    <option value="Sanitoor">Sanitoor</option>
                    <option value="Velipettai ST">Velipettai ST</option>
                    <option value="Valampuri Vinayagar">Valampuri Vinayagar</option>
                    <option value="Vankatampatti">Vankatampatti</option>
                    <option value="Oddapatti">Oddapatti</option>
                    <option value="Dr BR Ambadkar Colony">Dr BR Ambadkar Colony</option>
                    <option value="KMK Temple Colony">KMK Temple Colony</option>
                    <option value="Kodukkaattai">Kodukkaattai</option>
                    <option value="Muniyappan Temple Street">Muniyappan Temple Street</option>
                    
                    <!-- Coimbatore Villages -->
                    <option value="ESI">ESI</option>
                    <option value="GandhiNagar">GandhiNagar</option>
                    <option value="N G R Salai Rode">N G R Salai Rode</option>
                    <option value="Sri Krishna Skilks">Sri Krishna Skilks</option>
                    <option value="Old Vinayagar Temple Street">Old Vinayagar Temple Street</option>
                    <option value="Achipatti RamaSamy">Achipatti RamaSamy</option>
                    <option value="Sulakkal Rode">Sulakkal Rode</option>
                    <option value="Pechi Ammman Temple Street">Pechi Ammman Temple Street</option>
                    <option value="Karthik Poultry farm">Karthik Poultry farm</option>
                    <option value="Kovilpalayam">Kovilpalayam</option>
                    <option value="Nagar Kovil">Nagar Kovil</option>
                    <option value="Thirupathi Venkatachalapathi Temple">Thirupathi Venkatachalapathi Temple</option>
                    <option value="KSRPP.MILK PTE LTD">KSRPP.MILK PTE LTD</option>
                    <option value="Solaiandavar Temple">Solaiandavar Temple</option>
                    
                    <!-- Karnataka Villages -->
                    <option value="Amruta">Amruta</option>
                    <option value="Anegadde">Anegadde</option>
                    <option value="Billodi">Billodi</option>
                    <option value="Borikoppa">Borikoppa</option>
                    <option value="Andagaduduru">Andagaduduru</option>
                    <option value="Baise">Baise</option>
                    <option value="Kabale">Kabale</option>
                    <option value="Kadigeri">Kadigeri</option>
                    <option value="Agalabagilu">Agalabagilu</option>
                    <option value="Agasadi">Agasadi</option>
                    <option value="Aluru">Aluru</option>
                    <option value="Aralasurali">Aralasurali</option>
                    <option value="Arehalli">Arehalli</option>
                    <option value="Balehalli">Balehalli</option>
                    <option value="Chakkodabilu">Chakkodabilu</option>
                    <option value="Changara">Changara</option>
                    <option value="Achapura">Achapura</option>
                    <option value="Aduru">Aduru</option>
                    <option value="Atavdi">Atavdi</option>
                    <option value="Ballibyelu">Ballibyelu</option>
                    <option value="Ambaragodlu">Ambaragodlu</option>
                    <option value="Araleekoppa">Araleekoppa</option>
                    <option value="Besuru">Besuru</option>
                    <option value="Devasa">Devasa</option>
                    <option value="Aretalagadde">Aretalagadde</option>
                    <option value="Banksana">Banksana</option>
                    <option value="Bankavalli">Bankavalli</option>
                    <option value="Bilagali">Bilagali</option>
                    <option value="Avalagodu">Avalagodu</option>
                    <option value="Balagodu">Balagodu</option>
                    <option value="Barige">Barige</option>
                    <option value="Bhadrapura">Bhadrapura</option>
                    <option value="Aipanahalli">Aipanahalli</option>
                    <option value="Akkihebbal">Akkihebbal</option>
                    <option value="Alambadi">Alambadi</option>
                    <option value="Alenahalli">Alenahalli</option>
                    <option value="Agasarahalli">Agasarahalli</option>
                    <option value="Aichanahalli">Aichanahalli</option>
                    <option value="Aralakuppe">Aralakuppe</option>
                    <option value="Attuppe">Attuppe</option>
                    <option value="Alanshettihalli">Alanshettihalli</option>
                    <option value="Ankanathapura">Ankanathapura</option>
                    <option value="Ataguru">Ataguru</option>
                    <option value="Byaladakere">Byaladakere</option>
                    <option value="Bekkalale">Bekkalale</option>
                    <option value="Bolare">Bolare</option>
                    <option value="Hosagali">Hosagali</option>
                    <option value="Kiranguru">Kiranguru</option>
                    <option value="Adakatahalli">Adakatahalli</option>
                    <option value="Agachahalli">Agachahalli</option>
                    <option value="Ambalajeerahalli">Ambalajeerahalli</option>
                    <option value="Anakanahalli">Anakanahalli</option>
                    <option value="A Chennapura">A Chennapura</option>
                    <option value="A Nagattihalli">A Nagattihalli</option>
                    <option value="Addihalli">Addihalli</option>
                    <option value="Aleesandra">Aleesandra</option>
                    <option value="Alphalli">Alphalli</option>
                    <option value="Antanahalli">Antanahalli</option>
                    <option value="Aralakuppenala">Aralakuppenala</option>
                    <option value="Amruthi">Amruthi</option>
                    <option value="Anunahalli">Anunahalli</option>
                    <option value="Anuvallu">Anuvallu</option>
                    <option value="Arakanakere">Arakanakere</option>
                    <option value="Bogadi">Bogadi</option>
                    <option value="Goruru">Goruru</option>
                    <option value="Kesare">Kesare</option>
                    <option value="Satagalli">Satagalli</option>
                    <option value="Dandikere">Dandikere</option>
                    <option value="Hongate">Hongate</option>
                    <option value="Marashe">Marashe</option>
                    <option value="Yadakola">Yadakola</option>
                    <option value="Anagatti">Anagatti</option>
                    <option value="Anemala">Anemala</option>
                    <option value="Hosuru">Hosuru</option>
                    <option value="Jiyara">Jiyara</option>
                    <option value="Bettahalli">Bettahalli</option>
                    <option value="Devalapura">Devalapura</option>
                    <option value="Karigala">Karigala</option>
                    <option value="Pura">Pura</option>
                    <option value="Asvalu">Asvalu</option>
                    <option value="Dallalu">Dallalu</option>
                    <option value="Madlapura">Madlapura</option>
                    <option value="Tippuru">Tippuru</option>
                    <option value="Agrahara">Agrahara</option>
                    <option value="Attiguppe">Attiguppe</option>
                    <option value="Belatturu">Belatturu</option>
                    <option value="Harave">Harave</option>
                    <option value="Adakananahalli">Adakananahalli</option>
                    <option value="Alatturu">Alatturu</option>
                    <option value="Basavanapura">Basavanapura</option>
                    <option value="Bidaragudu">Bidaragudu</option>
                    <option value="Akala">Akala</option>
                    <option value="Amakalli">Amakalli</option>
                    <option value="Ambale">Ambale</option>
                    <option value="Ariyuru">Ariyuru</option>
                    <option value="Kudachi">Kudachi</option>
                    <option value="Moraba">Moraba</option>
                    <option value="Mugalakhoda">Mugalakhoda</option>
                    <option value="Neelaji">Neelaji</option>
                    <option value="Bavachi">Bavachi</option>
                    <option value="Chinchali">Chinchali</option>
                    <option value="Devanakatti">Devanakatti</option>
                    <option value="Jodatti">Jodatti</option>
                    <option value="Balobal">Balobal</option>
                    <option value="Budihala">Budihala</option>
                    <option value="Dandapur">Dandapur</option>
                    <option value="Gokaka">Gokaka</option>
                    <option value="Adibatti">Adibatti</option>
                    <option value="Betageri">Betageri</option>
                    <option value="Kandratti">Kandratti</option>
                    <option value="Mannikeri">Mannikeri</option>
                    <option value="Beedaki">Beedaki</option>
                    <option value="Bhagojikoppa">Bhagojikoppa</option>
                    <option value="Bijagupi">Bijagupi</option>
                    <option value="Budanura">Budanura</option>
                    <option value="Aribenchi">Aribenchi</option>
                    <option value="Bannura">Bannura</option>
                    <option value="Bochabala">Bochabala</option>
                    <option value="Chilamura">Chilamura</option>
                    <option value="Adi">Adi</option>
                    <option value="Balagunda">Balagunda</option>
                    <option value="Bhuranaki">Bhuranaki</option>
                    <option value="Abanalle">Abanalle</option>
                    <option value="Akralli">Akralli</option>
                    <option value="Ambevadi">Ambevadi</option>
                    <option value="Anagadi">Anagadi</option>
                   
                </select>
                
            </div>
            <div class="content-right">
                <label for="ownerName" class="ownerName">Owner Name:</label>
                <input type="text" name="ownerName" id="ownerName">
                            
                <label for="mobileNumber">Mobile Number:</label>
                <input type="number" name="mobileNumber" id="mobileNumber">
    
                <label for="aadharNumber">Aadhar Number:</label>
                <input type="number" name="aadharNumber" id="aadharNumber">
    
                <label for="houseNumber">House Number:</label>
                <input type="number" name="houseNumber" id="houseNumber">
    
                <label for="surveyNumber">Survey Number:</label>
                <input type="number" name="surveyNumber" id="surveyNumber">
    
                <label for="year">Year:</label>
                <input type="number" name="year" id="year">
    
                
                
            </div>
        </div>
        <div class="button-container">
            <button type="submit" class="btn btn-success" name="action" value="addrecord">Add</button>
        </div>
    </form>
       
    <footer id="footerButton">
        <p>&copy; 2023 <a href="mailto:your-email@example.com">ulaga774.xworkz@gmail.com</a></p>
    </footer>
</body>

</html>

