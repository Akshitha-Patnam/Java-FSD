package com.test.demo.Model;

import jakarta.persistence.*;
import lombok.*;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Entity
    @Table(name = "employees")
    public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(nullable = false)
        private String firstName;

        @Column(nullable = false)
        private String lastName;

        @Column(nullable = false)
        private String email;
        
        
        public Employee() {}

		public Employee(long id, String firstName, String lastName, String email) {
			
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
        
        

}
