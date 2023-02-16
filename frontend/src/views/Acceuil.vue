
<script setup>
// Vue Material Kit 2 component
import Alert from "../components/Alert.vue";
</script>
<template>
    
    <nav class="navbar align-items-center border-bottom">
        <div class="container-fluid">
            <div class="d-flex align-items-center ">
                <a href="#" class="navbar-brand m-0 textColor fw-bold brand">Syllabus</a>
                <div id="verticalbar" class="mx-xxl-2 mx-1 d-none d-lg-inline-block"></div>
                <a href="#" class="nav-link textColor fw-lighter lh-sm brandSubHeading d-none d-lg-inline-block">Ecole 
                    <br>
                    <span class="fw-medium brandSubHeading d-none d-lg-inline-block">d'ingénieurs ISIS</span>
                </a>
            </div>
            <div class="logo">
                    <img  src="../assets/logoisis.png">
            </div>
            <div class="d-flex align-items-center">
                <div class="d-none d-lg-block">
                    <ul class="d-flex m-0 list-unstyled ">
                        <li class="nav-item iconChange  me-4 pt-2">
                            <a href="#" class="nav-link text-center  p-0">
                                <div class=" d-flex align-items-center overflow-hidden changeWidth mx-auto">
                                    <img class="one iconHeight mx-2" src="/static_files/svgs2/book.svg" alt="book">
                                    <img class="two iconHeight mx-2" src="/static_files/svgs2/book-half.svg"
                                        alt="book-half">
                                </div>
                                <div class="smallFont textColor">Cycle Etudiant </div>
                            </a>
                        </li>
                        <li class="nav-item iconChange   me-4 pt-2">
                            <a href="#" class="nav-link text-center p-0">
                                <div class=" d-flex align-items-center overflow-hidden changeWidth mx-auto">
                                    <img class="iconHeight mx-2" src="/static_files/svgs2/dpad.svg" alt="dpad">
                                    <img class=" iconHeight mx-2" src="/static_files/svgs2/dpad-fill.svg" alt="dpad">
                                </div>
                                <div class="smallFont textColor">Cycle Apprentissage</div>
                            </a>
                        </li>
            
                    </ul>
                </div>
                
                <button id="loginBtn" class="btn btn-sm m-sm-2 m-1 bg-primary text-white rounded-5 px-sm-3 px-2">Connexion
                    <img class="d-none d-lg-inline-block" src="/static_files/svgs2/box-arrow-in-right.svg"
                        alt="box-arrow">
                </button>
            </div>
        </div>
    </nav>
 <Alert color="success">
  <h4 class="alert-heading text-black">Bon Travail !</h4>
  <p class = "text-black">
    That’s the main thing people are controlled by! Thoughts- their
    perception of themselves! They&#39;re slowed down by their perception
    of themselves. If you&#39;re taught you can&#39;t do anything, you
    won&#39;t do anything. I was taught I could do everything.
  </p>
  <hr class="horizontal light text-black" />
  <p class="text-black">
    What else could rust the heart more over time? Blackgold.
  </p>
 </Alert>
 
 <div class="alert alert-success">
  <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
  <strong>Title!</strong> Alert body ...
 </div>
 
</template>

<style scoped>


.textColor {
            color: #2a5a94;
        }

.logo img{
  width : 144px ;
  height :150px;
  margin-right: 500px;
}

        #verticalbar {
            height: 40px;
            width: 1px;
            background: #97a2b0;
        }

        .searchInput {
            width: 320px;
            border-radius: 10px;
            border: none;
            padding-top: 14px;
            padding-bottom: 4px;
            border: 1px solid #d5d6d6;
        }

        .searchInput:focus-visible {
            outline: none;
        }

        input.searchInput::placeholder {
            color: #2468bb;
            vertical-align: middle;
        }

        .changeWidth {
            width: 36px;
        }

        .iconChange:after {
            content: "";
            display: block;
            margin: auto;
            height: 3px;
            width: 0px;
            background: transparent;
            transition: all 0.5s ease;
        }

        .iconChange:hover::after {
            width: 100%;
            background: #0d6efd;
        }

        .iconHeight {
            height: 22px;
            width: 22px;
        }

        .iconChange:hover a {
            color: #0d6efd;
        }

        .iconChange img {
            transition: all 500ms;
        }

        .iconChange:hover img {
            transform: translateX(-180%);
            transform-origin: right;
            transition: transform 500ms ease-in-out;
        }

        .smallFont {
            font-size: 15px;
        }

        #loginBtn {
            background: #0d6efd;
            background: linear-gradient(to left, #0073e6 50%, #005CB8 50%) right;
            background-size: 200%;
            transition: 0.5s ease-out;
        }

        #loginBtn:hover {
            background-position: left;
        }


        .extraSmallFont {
            font-size: 12px;
            border-bottom: 2px solid transparent;
        }

        #secondNav {
            background: #ffffffd4
        }

        @media screen and (max-width: 1400px) {
            .brand {
                font-size: 18px;
            }

            .brandSubHeading {
                font-size: 12px;
            }

            .searchInput {
                width: 280px;
            }

            .iconHeight {
                height: 20px;
                width: 20px;
            }

            .searchImg {
                top: 12px;
                right: 250px;
            }
        }






</style>