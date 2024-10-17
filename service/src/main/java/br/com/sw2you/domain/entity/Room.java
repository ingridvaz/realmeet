package br.com.sw2you.domain.entity;

import java.util.Objects;

public class Room {

    private Long id;
    private String name;
    private Integer seat;
    private Boolean active;

    public Room() {
    }

    private Room(Long id, String name, Integer seat, Boolean active) {
        this.id = id;
        this.name = name;
        this.seat = seat;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSeat() {
        return seat;
    }

    public Boolean getActive() {
        return active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(id, room.id) && Objects.equals(name, room.name) && Objects.equals(seat, room.seat) && Objects.equals(active, room.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, seat, active);
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seat=" + seat +
                ", active=" + active +
                '}';
    }

    public static RoomBuilder newBuilder() {
        return new RoomBuilder();
    }

    public static final class RoomBuilder {
        private Long id;
        private String name;
        private Integer seat;
        private Boolean active;

        private RoomBuilder() {}

        public RoomBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public RoomBuilder name(String name) {
            this.name = name;
            return this;
        }

        public RoomBuilder seat(Integer seat) {
            this.seat = seat;
            return this;
        }

        public RoomBuilder active(Boolean active) {
            this.active = active;
            return this;
        }

        public Room build() {
            return new Room(id, name, seat, active);
        }
    }
}
