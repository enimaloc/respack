package fr.enimaloc.respack.extra;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import fr.enimaloc.respack.lang.key.Key;
import fr.enimaloc.utils.ISO3166;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RegionalCompliancies {
    private final ISO3166 country;
    private final List<Sub> subs = new ArrayList<>();

    public RegionalCompliancies(ISO3166 country) {
        this.country = country;
    }

    public RegionalCompliancies add(int delay, int period, String title, String description) {
        return add(new Sub(delay, period, title, description));
    }

    public RegionalCompliancies add(int delay, int period, Key title, String description) {
        return add(delay, period, title.getKey(), description);
    }

    public RegionalCompliancies add(int delay, int period, String title, Key description) {
        return add(delay, period, title, description.getKey());
    }

    public RegionalCompliancies add(int delay, int period, Key title, Key description) {
        return add(delay, period, title.getKey(), description.getKey());
    }

    public RegionalCompliancies add(int period, String title, String description) {
        return add(new Sub(period, title, description));
    }

    public RegionalCompliancies add(int period, Key title, String description) {
        return add(period, title.getKey(), description);
    }

    public RegionalCompliancies add(int period, String title, Key description) {
        return add(period, title, description.getKey());
    }

    public RegionalCompliancies add(int period, Key title, Key description) {
        return add(period, title.getKey(), description.getKey());
    }

    public RegionalCompliancies add(Sub sub) {
        subs.add(sub);
        return this;
    }

    public Optional<Sub> getByTitle(String title) {
        for (Sub sub : subs) {
            if (sub.getTitle().equals(title)) {
                return Optional.of(sub);
            }
        }
        return Optional.empty();
    }

    public Optional<Sub> getByDescription(String description) {
        for (Sub sub : subs) {
            if (sub.getMessage().equals(description)) {
                return Optional.of(sub);
            }
        }
        return Optional.empty();
    }

    public ISO3166 getCountry() {
        return country;
    }

    public void remove(Sub sub) {
        subs.remove(sub);
    }

    public boolean isEmpty() {
        return subs.isEmpty();
    }

    public JsonObject toJson(JsonObject json) {
        JsonArray subs = new JsonArray();
        for (Sub sub : this.subs) {
            subs.add(sub.toJson());
        }
        json.add(country.getAlpha3(), subs);
        return json;
    }

    public static class Sub {
        private int delay;
        private int period;
        private String title;
        private String message;

        public Sub(int period, Key title, String message) {
            this(0, period, title.getKey(), message);
        }

        public Sub(int period, String title, Key message) {
            this(0, period, title, message.getKey());
        }

        public Sub(int period, Key title, Key message) {
            this(0, period, title.getKey(), message.getKey());
        }

        public Sub(int period, String title, String message) {
            this(0, period, title, message);
        }

        public Sub(int delay, int period, Key title, String message) {
            this(delay, period, title.getKey(), message);
        }

        public Sub(int delay, int period, String title, Key message) {
            this(delay, period, title, message.getKey());
        }

        public Sub(int delay, int period, Key title, Key message) {
            this(delay, period, title.getKey(), message.getKey());
        }

        public Sub(int delay, int period, String title, String message) {
            this.delay = delay;
            this.period = period;
            this.title = title;
            this.message = message;
        }

        public int getDelay() {
            return delay;
        }

        public Sub setDelay(int delay) {
            this.delay = delay;
            return this;
        }

        public int getPeriod() {
            return period;
        }

        public Sub setPeriod(int period) {
            this.period = period;
            return this;
        }

        public String getTitle() {
            return title;
        }

        public Sub setTitle(String title) {
            this.title = title;
            return this;
        }

        public String getMessage() {
            return message;
        }

        public Sub setMessage(String message) {
            this.message = message;
            return this;
        }

        public JsonObject toJson() {
            if (period == 0) {
                throw new IllegalStateException("Period is not set");
            }
            if (period < 0) {
                throw new IllegalStateException("Period is negative");
            }
            if (delay < 0) {
                throw new IllegalStateException("Delay is negative");
            }
            if (title == null) {
                throw new IllegalStateException("Title is not set");
            }
            if (message == null) {
                throw new IllegalStateException("Message is not set");
            }
            JsonObject json = new JsonObject();
            if (delay != 0) {
                json.addProperty("delay", delay);
            }
            json.addProperty("period", period);
            json.addProperty("title", title);
            json.addProperty("message", message);
            return json;
        }
    }
}
