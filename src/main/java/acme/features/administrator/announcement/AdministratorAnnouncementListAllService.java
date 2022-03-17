package acme.features.administrator.announcement;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.announcements.Announcement;
import acme.framework.components.models.Model;
import acme.framework.controllers.Request;
import acme.framework.roles.Administrator;
import acme.framework.services.AbstractListService;

@Service
public class AdministratorAnnouncementListAllService implements AbstractListService<Administrator, Announcement> {

	// Internal state ---------------------------------------------------------

		@Autowired
		protected AdministratorAnnouncementRepository repository;

		// AbstractListService<Administrator, Announcement> interface --------------


		@Override
		public boolean authorise(final Request<Announcement> request) {
			assert request != null;

			return true;
		}

		@Override
		public void unbind(final Request<Announcement> request, final Announcement entity, final Model model) {
			assert request != null;
			assert entity != null;
			assert model != null;

			request.unbind(entity, model, "title", "moment", "status");
		}

		@Override
		public Collection<Announcement> findMany(final Request<Announcement> request) {
			assert request != null;

			Collection<Announcement> result;

			result = this.repository.findAllAnnouncements();

			return result;
		}
}
