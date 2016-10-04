(ns page-rank.core-test
  (:require [clojure.test :refer :all]
            [page-rank.core :refer :all]))

(deftest valor-absoluto
 (testing "El valor absoluto de -5 debe ser 5"
    (is (= 5 (valor-absoluto -5))))
  
  (testing "El valor absoluto de 5 debe ser 5"
    (is (= 5 (valor-absoluto 5)))))

(deftest para?
  (testing "parar? debe lanzar true al evaluar [1/3 1/3 1/3] [1/3 1/3 1/30]"
    (is (true? (parar? [1/3 1/3 1/3] [1/3 1/3 1/3]))))) 
